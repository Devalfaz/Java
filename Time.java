
import java.util.Scanner;

public class Time {
    int hour, min, sec;

    Time(int h, int m, int s) {
        this.hour = h;
        this.min = m;
        this.sec = s;
    }

    public static Time sum(Time t1, Time t2) {
        Time temp = new Time(0, 0, 0);

        temp.hour = t1.hour + t2.hour;
        temp.min = t1.min + t2.min;
        temp.sec = t1.sec + t2.sec;

        return temp;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hour of first time(24 hour) ");
        int time1hour = input.nextInt();
        System.out.println("Enter minute of first time(24 hour) ");
        int time1min = input.nextInt();
        System.out.println("Enter second of first time(24 hour) ");
        int time1sec = input.nextInt();
        System.out.println("Enter hour of second time(24 hour) ");
        int time2hour = input.nextInt();
        System.out.println("Enter minute of second time(24 hour) ");
        int time2min = input.nextInt();
        System.out.println("Enter second of second time(24 hour) ");
        int time2sec = input.nextInt();
        input.close();
        Time t1 = new Time(time1hour, time1min, time1sec);
        Time t2 = new Time(time2hour, time2min, time2sec);
        Time temp = sum(t1, t2);
        System.out.printf("Sum is: " + temp.hour + ":" + temp.min + ":" + temp.sec);
    }
}