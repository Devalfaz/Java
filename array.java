import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class array {
    static int largest(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    static int secondLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    static int smallest(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        s.close();

        final int length = Array.getLength(arr);
        System.out.println("Largest in given array is " + largest(arr));
        System.out.println("Second Largest in given array is " + secondLargest(arr, length));
        System.out.println("Smallest in given array is " + smallest(arr));

    }
}
