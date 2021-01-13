import java.util.Scanner;

class Student {
    void details() {
        int id;
        String name;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the id: ");
        id = s.nextInt();
        System.out.print("Enter the name: ");
        name = s.next();
    }
}

class Result extends Student {
    void markresult() {
        int marks[] = new int[5];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.print("Enter Marks of Subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        System.out.print("Total mark is: " + total + "\n");
        avg = total / 5;
        System.out.print("Average Mark is: " + avg + "\n");
    }
}

public class TotalMarkGrade {
    public static void main(String args[]) {
        Result r = new Result();
        r.details();
        r.markresult();
    }
}