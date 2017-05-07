package chapter10;

public class Exercise_109 {

	public static void main(String[] args){

	@SuppressWarnings({})
	class Course {
	    private static final int INITIAL_SIZE = 3;
	    
	    private String courseName;
	    private String[] students = new String[INITIAL_SIZE];
	    private int numberOfStudents;

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }

	    public void addStudent(String student) {
	        if (numberOfStudents >= students.length)
	            students = grow(students);
	        students[numberOfStudents] = student;
	        numberOfStudents++;
	    }

	    public String[] getStudents() {
	        return students;
	    }

	    public int getNumberOfStudents() {
	        return numberOfStudents;
	    }  

	    public String getCourseName() {
	        return courseName;
	    }  

	    public void dropStudent(String student) {
	        // Left as an exercise in Exercise 9.9
	        for (int i = 0; i < numberOfStudents; i++)
	            if (students[i].equals(student)) {
	                while (i < numberOfStudents) {
	                    students[i] = students[i+1];
	                    i++;
	                }
	                numberOfStudents--;
	                return;
	            }
	        // failed to find student to drop; throw exception?
	    }

	    /** zero out the number of students */
	    public void clear() {
	        numberOfStudents = 0;
	    }

	    /** output one student per line, numbered */
	    public String listStudents() {
	        String list = numberOfStudents == 0 ? "no students enrolled" : "";
	        for (int i = 0; i < numberOfStudents; i++)
	            list += String.format("%2d: %s\n", i+1, students[i]);
	        return list;
	    }

	    /** private method to grow the String array */
	    private String[] grow(String[] oldArray) {
	        // set new size double old size, or to INITIAL_SIZE if for some reason it's not larger
	        int newSize = oldArray.length >= INITIAL_SIZE ? oldArray.length * 2 : INITIAL_SIZE;
	        String[] newArray = new String[newSize];

	        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
	        /*
	        for (int i = 0; i < oldArray.length; i++)
	            newArray[i] = oldArray[i];
	        */
	        return newArray;
	    }

	    @Override
	    public String toString() {
	        return String.format("Course name: %s; enrollment: %d/%d", courseName, numberOfStudents, students.length);
	    }
	}
	}
}
