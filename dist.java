import java.util.Scanner;

public class dist {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter First Points : ");
        double x1 = get.nextDouble();
        double y1 = get.nextDouble();
        System.out.println("Enter the second point : ");
        double x2 = get.nextDouble();
        double y2 = get.nextDouble();
        point k =  new point(x1, y1);
        point l =  new point(x2, y2);
        k.distance(l);

    }

    static class point {
        double x, y;

        point(double a, double b) {
            x = a;
            y = b;
        }

        void distance(point p1) {
            double distance = Math.sqrt(Math.pow(x - p1.x, 2)) + Math.sqrt(Math.pow(y - p1.y, 2));
            System.out.println("The distance between two points is : " + distance);
        }

    }
}