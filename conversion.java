import java.util.Scanner;
class conversion
{
    public static void main(String args[])
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      int num =input.nextInt();
      input.close();
        
      // calling method toHexString()
      String str1 = Integer.toHexString(num);
      System.out.println("Method 1: Decimal to hexadecimal: "+str1);
      String str2 = Integer.toBinaryString(num);
      System.out.println("Method 1: Decimal to Binary: "+str2);
      String str3 = Integer.toOctalString(num);
      System.out.println("Method 1: Decimal to Octal: "+str3);
    }
}