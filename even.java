import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit");
        n = s.nextInt();
        odd o = new odd(n);
        try {
            Thread.sleep(500);
            for (int j = 2; j <= n; j += 2) {
                System.out.println("Even = " + j);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

class odd implements Runnable {
    Thread t;
    int n;

    odd(int a) {
        n = a;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= n; i += 2) {
                System.out.println("Odd = " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
