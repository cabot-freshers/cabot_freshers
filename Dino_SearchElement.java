//Java Program to Quick Sort a Array.
//Author : Dino Sunny
import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Dino_SearchElement
    {
        public static void main(String[] args)
               {
		boolean finish = false;
 		System.out.println(" Program for Quick Sort");         				 	//Heading for the output
		while(!finish)
		 	 {
		     	   try  
				{
                        	int n,i;
				System.out.println("Enter the length of the Array");           		//Accepting the length of the array
                       		Scanner scan = new Scanner(System.in);
                       		n = scan.nextInt();
                        	int arr[]=new int[n];
				if(n==0)
				{
				System.out.println("Sorry..!!   Enter a Positive Integer ");    	//Setting array length greater than zero
				continue;
				}
                       
				System.out.println("Enter the array elements");        			//Accepting the array elements
				for(i=0;i<n;i++)
                        	{
					while (!scan.hasNextInt())
            				{        	
                   			scan.next(); 							// For accepting only int values  
					System.out.println("It is not a integer..!! enter a integer"); 	
           			 	}
                              	 	arr[i]= scan.nextInt();
                            	}
                  
				int low=0;
				string userInput;								//setting the left most positon as low
                       		search(arr,n);	
				System.out.println("You want to continue : (Y/N) ");			//scan to continue
                		Scanner s = new Scanner(System.in);	
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
			 	catch (Exception e) 
				{
				System.out.println("Your entry is not a valid number"+e);		//exception case		
	               	        }
		 		}	
		    }

	public static void search(int arr[], int n)							//Function Declaration
		{
		int s;
		System.out.println("Enter the search element");						//scan the search element		
		Scanner scan1 = new Scanner(System.in);
		s = scan1.nextInt();	

		System.out.println("search element : " + s);
       		int flag=0;

       		for(int i=0;i<n;i++)
			{
          		if(arr[i]==s)									//search the element in the array
				{
            	             	flag=1;	
				System.out.println(" It is found in the array at position : " + (i+1));
          			}
      			}

      	 		if(flag==0)
				{
         			System.out.println("\n The search element is not found in the array.");
       				}
		}								
    }


