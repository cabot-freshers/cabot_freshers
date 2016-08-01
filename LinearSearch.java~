import java.util.Scanner;
import java.io.*;
 
class LinearSearch 
{
 	public static void main(String args[]){
    		//do{
			while(true){
    				try{
    					int c, n, search, array[];
 					//String a="";
   				 	Scanner in = new Scanner(System.in);
    					System.out.println("Enter number of elements");
    					while (!in.hasNextInt()){        
    				
    						System.out.print("Please enter a positive integer! "); // Re-prompt
						in.next(); // Read and discard offending non-int input
					}
    					n = in.nextInt();
    					if(n==0){
						System.out.println("Please enter a positive integer!");
						continue;
					} 
    					array = new int[n];
 
    					System.out.println("Enter " + n + " integers");
 
    					for (c = 0; c < n; c++){
						System.out.print("Enter element "+(c+1)+": ");
						while (!in.hasNextInt()){        
    						in.next(); // Read and discard offending non-int input
    						System.out.print("Please enter an integer! "); // Re-prompt
					}
      					array[c] = in.nextInt();
				}
 
    				System.out.println("Enter value to find");
    				search = in.nextInt();
 
    				for (c = 0; c < n; c++){
      					if (array[c] == search){     /* Searching element is present */
         					System.out.println(search + " is present at location " + (c + 1) + ".");
          					break;
      					}
   				}
   				if (c == n)  /* Searching element is absent */
      					System.out.println(search + " is not present in array.");
  
  				System.out.println("Continue(Y/N)");
        			// a = in.next();
				if(in.next().equalsIgnoreCase("n"))/*Prompt the user for continue the 														search process*/
					break;
			}
  			catch (Exception e){
  				System.out.println("Please enter positive integers");
	
            
		}
	}//while(in.next().equalsIgnoreCase("y")||in.next().equalsIgnoreCase("yes"));


  }
}
