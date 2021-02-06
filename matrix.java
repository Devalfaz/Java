import java.util.Scanner;

public class matrix {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row length of an array : ");
        int row = sc.nextInt();
        int a[][] = new int[row][row];
        System.out.print("Enter " + row * row + " Elements to Store in Array :\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int transpose[][] = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = a[j][i];
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }
        int trace = 0;
        for (int i = 0; i < row; i++) {
            trace += a[i][i];
        }
        System.out.println("\nTrace = " + trace);
    }

}
