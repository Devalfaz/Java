import java.util.Scanner;
public class triangle {
     
      
        // Function to check if the triangle 
        // is equilateral or isosceles or scalene 
        static String checkTriangle(int x, int y, int z) 
        { 
          
            // Check for equilateral triangle 
            if (x == y && y == z ) 
                return ("Equilateral Triangle"); 
          
            // Check for isoceles triangle 
            else if (x == y || y == z || z == x ) 
                return("Isoceles Triangle"); 
          
            // Otherwise scalene triangle 
            else
                return ("Scalene Triangle"); 
        } 

        static double calculateArea(int a, int b, int c) {
            double p = (a+b+c)/2;       
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
          
        // Driver Code 
        public static void main(String[] args) 
        { 
              
            // Given sides of triangle 
            Scanner in = new Scanner(System.in);
            System.out.print("Input 1st integer: ");
            int x = in.nextInt();
            System.out.print("Input 2nd integer: ");
            int y = in.nextInt();
            System.out.print("Input 3rd integer: ");
            int z = in.nextInt();
            in.close();              
            // Function call 
            System.out.println("The triangle is "+checkTriangle(x, y, z)+" and the area of the triangle is "+ calculateArea(x,y,z));
        } 
} 
