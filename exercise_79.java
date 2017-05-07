package Chapter7;

import java.util.Scanner;

public class exercise_79 {


	    static final int SIZE = 10;
		private static Scanner input;

	    public static void main(String[] args) {

	        double[] n = new double[SIZE];
	        input = new Scanner(System.in);

	        System.out.print("Enter " + SIZE + " numbers: ");
	        for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

	        System.out.println("The minimum number is: " + min(n));
	    }

	    public static double min(double[] array) {

	        double min = array[0];
	        for (int i = 0; i < array.length; i++) {

	            if (min > array[i]) min = array[i];
	        }

	        return min;
	    }
	}