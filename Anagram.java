import java.util.*;
public class Anagram {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first String: ");
    String str1 = input.nextLine();
    System.out.print("Enter second String: ");
    String str2 = input.nextLine();
    input.close();
    
    if(str1.length() == str2.length()) {

      char[] array1 = str1.toCharArray();
      char[] array2 = str2.toCharArray();

      Arrays.sort(array1);
      Arrays.sort(array2);

      boolean result = Arrays.equals(array1, array2);

      if(result) {
        System.out.println("They are anagram.");
      }
      else {
        System.out.println("They are not anagram.");
      }
    }
    else {
      System.out.println("They are not anagram.");
    }

   
  }
}