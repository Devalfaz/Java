import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        System.out.printf("Enter any number:");

        Scanner in = new Scanner(System.in);
        int firstInt = in.nextInt();
        in.close();

        int n = firstInt, t1 = 0, t2 = 1;
        System.out.printf("First " + n + " terms: %n");

        for (int i = 1; i <= n; ++i)
        {
            System.out.printf(t1 + "%n");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
