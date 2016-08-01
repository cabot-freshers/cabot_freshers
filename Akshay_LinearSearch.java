/**AUTHOR- Akshay Venugopal**/
/**Programme for linear search**/


import java.util.Scanner;
 
class LinearSearch 
{
	public static void main(String args[])
	{
		int k=1, j, i, n, search;	//initializing values//				
		
		while(k!=0)		//loop for continious execution//
		{		
			try
			{
				j = 0;
				Scanner in = new Scanner(System.in);
				
				System.out.println("Enter number of elements");
				n = in.nextInt(); 
				
				int array[] = new int[n];
	
				System.out.println("Enter the values integers");
				for (i = 0; i < n; i++)
      				     array[i] = in.nextInt();
 	
   				System.out.println("Enter value to find");
    				search = in.nextInt();				//recieving all values//

    				for (i = 0; i < n; i++)				//conducting linear search//
    				{
      					if (array[i] == search)     
      					{	
						j = i + 1;         					
						
					}
   				}
   					
					if (j != 0)
					{
      						System.out.println(search + " is present at location "+(j));
					}					
					else
					{
						System.out.println(search + " is not present" );
					}

				
				System.out.println("You want to continue : (Y/N) ");	//loop for user continuation//
				String userInput = in.next();
				if (userInput.equalsIgnoreCase("N"))
                        	{
                                       	break;
                        	}    
       				else if(!userInput.equalsIgnoreCase("Y"))
                        	{
                               		System.out.println("Invalid Input\n");
                    			break;   
                        	}
				
  			}
  			
			catch (Exception e)			// catch any unwanted input from the user//	
  			{
  				System.out.println("Error Encountered please enter correct input");
  			}
 		}	
	}
}
