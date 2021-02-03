
import java.util.*;

class Employee {
    int emp_id;
    String emp_name;
    String emp_designation;
    String emp_dept;

    void details() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the emp_id");
        emp_id = s.nextInt();

        System.out.println("Enter the emp_name");
        emp_name = s.next();

        System.out.println("Enter the emp_designation");
        emp_designation = s.next();

        System.out.println("Enter the emp_dept");
        emp_dept = s.next();

    }
}

public class employee extends Employee {
    public static void main(String args[])

    {
        double basic, DA, HRA, allowance, netsal;
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        obj.details();
        System.out.println("Enter the basic salary");
        basic = sc.nextInt();
        sc.close();
        HRA = 1250;
        DA = 1.1 * basic;
        allowance = 0.35 * basic;
        netsal = (HRA + DA + allowance + basic);
        System.out.println("net salary=" + netsal);
    }
}
