import java.util.Scanner;

public class triangle {

    static String checkTriangle(int x, int y, int z) {

        if (x == y && y == z)
            return ("Equilateral Triangle");

        else if (x == y || y == z || z == x)
            return ("Isoceles Triangle");

        else
            return ("Scalene Triangle");
    }

    static double calculateArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int x = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int y = in.nextInt();
        System.out.print("Input 3rd integer: ");
        int z = in.nextInt();
        in.close();
        System.out.println("The triangle is " + checkTriangle(x, y, z) + " and the area of the triangle is "
                + calculateArea(x, y, z));
    }
}
