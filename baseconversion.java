import java.util.Scanner;

public class baseconversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Decimal number");
        int num = input.nextInt();
        input.close();
        String str1 = Integer.toHexString(num);
        System.out.println("Decimal to Hexadecimal : " + str1);
        String str2 = Integer.toBinaryString(num);
        System.out.println("Decimal to Binary : " + str2);
        String str3 = Integer.toOctalString(num);
        System.out.println("Decimal to Octal : " + str3);
    }

}
