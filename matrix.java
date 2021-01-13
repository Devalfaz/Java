import java.util.Scanner;

public class matrix {

    public static void main(String args[]){  


    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Row length of an array : ");
	int row=sc.nextInt();
	int a[][]=new int[row][row];//declaration    	 
	System.out.print("Enter " + row*row + " Elements to Store in Array :\n");
        for (int i = 0; i < row; i++)
	{
	    for(int j = 0; j < row; j++)
	    {
           	a[i][j] = sc.nextInt();
	    }
    }    
    sc.close();
        //creating a matrix      
            
        //creating another matrix to store transpose of a matrix  
        int transpose[][]=new int[row][row];  //3 rows and 3 columns  
            
        //Code to transpose a matrix  
        for(int i=0;i<row;i++){    
        for(int j=0;j<row;j++){    
        transpose[i][j]=a[j][i];  
        }    
        }    
          
        System.out.println("Printing Matrix without transpose:");  
        for(int i=0;i<row;i++){    
        for(int j=0;j<row;j++){    
        System.out.print(a[i][j]+" ");    
        }    
        System.out.println();//new line    
        }    
        System.out.println("Printing Matrix After Transpose:");  
        for(int i=0;i<row;i++){    
        for(int j=0;j<row;j++){    
        System.out.print(transpose[i][j]+" ");    
        }    
        System.out.println();//new line    
        }    
        }
    
}
