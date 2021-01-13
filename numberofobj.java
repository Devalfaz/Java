public class numberofobj {
    
     
  
        static int noOfObjects = 0; 
      
        { 
            noOfObjects += 1; 
        } 
      
        public numberofobj() 
        { 
        } 
        public numberofobj(int n) 
        { 
        } 
        public numberofobj(String s) 
        { 
        } 
      
        public static void main(String args[]) 
        { 
            numberofobj t1 = new numberofobj(); 
            numberofobj t2 = new numberofobj(5); 
            numberofobj t3 = new numberofobj("GFG"); 
      
            System.out.println("The number of Objects is: "+numberofobj.noOfObjects); 

        } 
     

}
