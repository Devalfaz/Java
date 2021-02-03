import java.util.*;

public class removevowels {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str = input.nextLine();
        input.close();
        String str1 = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Srting without VOWELS: " + str1);
    }
}