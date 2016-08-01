//Java Program to Quick Sort a Array.
//Author : Dino Sunny
import java.io.*;
import java.util.Scanner;

class dino_quicksort
    {
        public static void main(String[] args)
                {
		boolean finish = false;
 		System.out.println(" Program for Quick Sort");         				 //Heading for the output
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
				System.out.println("Sorry..!!   Enter a Positive Integer ");    //Setting array length greater than zero
				continue;
				}
                       
			System.out.println("Enter the array elements");        			//Accepting the array elements
			for(i=0;i<n;i++)
                        {
				while (!scan.hasNextInt())
            			{        	
                   		scan.next(); 							// checking non int input and take new array element
                   		System.out.println("It is not a integer..!! enter a integer"); 	
           			 }
                              	 arr[i]= scan.nextInt();
                            }
                  
			int low=0;								//setting the left most positon as low
			int high=arr.length-1;  						//setting the right most positon as high 
                        sort(arr,low,high);							//calling the function sort
			
			System.out.println("Sorted array");
			for(i=0;i<n;i++)
				{				
				System.out.println(arr[i]+ "");					//Display the sorted array
				}

				System.out.println("You want to continue : (Y/N) ");		//Scan to continue
                		Scanner s = new Scanner(System.in);
                            	String user = s.next();
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
			catch(Exception e)
				{
				System.out.println("Your entry is not a valid number");		//exception case		
	               	        }
		  }	
		}
	    public static void sort(int arr[], int low, int high)				//Function Declaration
		{
			int i=low;
			int j=high;
			int temp;
			int pivot = arr[(low+high)/2];						//set pivot 
			while(i<=j)
			    {
				while(arr[i]<pivot)						//checking the left most element from the array is 
				i++;								//less than pivot 
				while(arr[j]>pivot)						//checking the right most element from the array is 
				j--;								//greater than pivot
					if(i<=j)						//Swaping the elements when the condition is wrong
					   {
						temp= arr[i];
						arr[i]= arr[j];
						arr[j]= temp;
						i++;
						j--;
					   }
			    }
			if(low<j)								//recursively sorting the left side 
			sort(arr, low, j); 					
			if(i<high)								//recursive sorting the right side 
			sort(arr, i, high);					
		}

    }
