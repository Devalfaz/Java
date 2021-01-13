import java.util.Scanner;

public class number {

    public int reverse(int number){

        int reverse = 0;  
        while(number != 0)   
        {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }  
            return reverse; 
    
        }
        public int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 

    public static void main(String[] args) {
        number n=new number();

        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int num = in.nextInt();
        System.out.println("reverse ="+n.reverse(num));
        System.out.println("sum ="+n.getSum(num));
        in.close();
        

    }

}
