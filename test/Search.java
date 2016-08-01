import java.io.*;
import java.util.*;

/**
   * The Search program implements an application that
   * search for integer elements and display position of elements to the standard output.
   *
   * @author  Catherine K G.
   */

class Search
{

/**
   * The main method is where the search implemented.
   * @param args Unused.
   * @return Void.
   */

	public static void main(String args[])
	{
		
		int limit,element,i,flag=0;
		int attempts = 1;
		while(attempts !=0)
		{
			Scanner s=new Scanner(System.in);
			try
			{	
				if(attempts==1)
					System.out.println("Please enter the number of elements.");
				else
					System.out.println("Please re-enter the number of elements.");
				limit=s.nextInt();//Read the limit
				int array[]=new int[limit];
				for(i=0;i<limit;i++)//Read Elements
				{	
					System.out.println("Please enter the element " +(i+1));
					while (!s.hasNextInt())
			   		{        
				  		s.next(); 
				   		System.out.println("Please enter an integer element........"); // Re-prompt
						System.out.println("\n-------------------------------------------------------\n");
			   		}
					array[i]=s.nextInt();
				}
				System.out.println("Please enter the element to search." );
				element=s.nextInt();
				for(i=0;i<limit;i++)
				{
					if(element==array[i])
					{
						System.out.println("\n--------------------------------------------------------\n");
						System.out.println("Element Found at position "+(i+1) );
						flag=1;
					}
				
				}
				if(flag==0)
				{
					System.out.println("\n--------------------------------------------------------\n");
					System.out.println("Element not Found");
				}
				flag=0;
				System.out.println("You want to continue : (Y/N) ");
				
         	 	
                    		String userInput = s.next();
                   		if (userInput.equalsIgnoreCase("N"))
                   		{
                       			 System.out.print("Thank you !!");
                        		 break;
                    		}    
                    		else if(!userInput.equalsIgnoreCase("Y"))
            			{
                            		System.out.print("Invalid Input\n");
					break;   
                    		}
			
				

			}
			catch(Exception e)//Exception
	     		{
				System.out.println("Sorry,Invalid Input.....");
				System.out.println("\n--------------------------------------------------------\n");
				attempts++;
	  		}
		}		
	}	
}


