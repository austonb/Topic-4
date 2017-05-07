package Chapter10;

public class exercise_101 {

public static void main(String[] args) {
    Time time = new Time(555550000);
    Time time2 = new Time();
    System.out.printf("%d:%d:%d%n%n",
        time2.getHour(),
        time2.getMinute(),
        time2.getSecond());

    System.out.printf("%d:%d:%d%n%n",
        time.getHour(),
        time.getMinute(),
        time.getSecond());
       
    time2.setTime(2432423534L);
    System.out.printf("%d:%d:%d%n%n",
        time2.getHour(),
        time2.getMinute(),
        time2.getSecond());
}
}

class Time {
private long mTime;

public Time() {
    mTime = System.currentTimeMillis();
}

public Time(long time) {
    mTime = time;
}
public Time(int hour, int minute, int second) {
}

public void setTime(long elapsedTime) {
    mTime = elapsedTime;
}


public int getHour() {
    return (int)(mTime / (1000 * 60 * 60)) % 24;
}

public int getMinute() {
    return (int)(mTime / (1000 * 60)) % 60;
}

public int getSecond() {
    return (int)(mTime / 1000) % 60;
}

}