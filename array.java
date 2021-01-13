import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Java Program to find maximum in arr[] 
class array 
{ 	
	// Method to find maximum in arr[] 
	static int largest(int[] arr) 
	{ 
		int i; 
		
		// Initialize maximum element 
		int max = arr[0]; 
		
		// Traverse array elements from second and 
		// compare every element with current max 
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		
		return max; 
    } 
    
    static int secondLargest(int[] a, int total) 
	{  
            int temp;  
            for (int i = 0; i < total; i++)   
                    {  
                        for (int j = i + 1; j < total; j++)   
                        {  
                            if (a[i] > a[j])   
                            {  
                                temp = a[i];  
                                a[i] = a[j];  
                                a[j] = temp;  
                            }  
                        }  
                    }  
                   return a[total-2];  
    }  

    static int smallest(int[] a) 
	{ 
        Arrays.sort(a);
        return a[0];
    }
	
	
	// Driver method 
	public static void main(String[] args) 
	{ 
        Scanner s=new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
        s.close();

        final int length=Array.getLength(arr);
        System.out.println("Largest in given array is " + largest(arr));
        System.out.println("Second Largest in given array is " + secondLargest(arr, length));
        System.out.println("Smallest in given array is " + smallest(arr)); 


	} 
} 
