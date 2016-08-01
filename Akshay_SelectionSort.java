//**This programme is implemented to apply selection sort algorithim into an array. Camel Casing is implemented here**//
//**Author-Akshay Venugopal**//

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

class Sort								
{
    public static void main(String args[])
    {		
		int time=1,smallerNumber=0,position=0,length;			//initializing values//
				
	while(time!=0)								//loop for continious execution untill correct//
	{				
		Scanner s = new Scanner(System.in);				//input from keyboard//
		
		try								//try is used to find exceptions within {...} its codes//
		{									
			System.out.println("\n Input length of the array");	//user inputs length//
			length = s.nextInt();					
			int arr1[] = new int[length];				//array needs to have length initialized done here//
				if(length==0)					
				{
				break;						//break if length is 0//
				}
			System.out.println("\n Input elements to the array");	//initialize array//
			for(int k = 0;k < length; k++)
			{
				arr1[k] = s.nextInt();				
			}
		
				for (int i = 0; i < length-1; i++)		//loop for finding least no position//	
       				{
            				position = i;
           				for (int j = i + 1; j < length; j++)		
					{                		
						if (arr1[j] < arr1[position])
                    				{
							position = j;		//position assigned to variable//
      						
						}
					}				
					smallerNumber = arr1[position]; 	//swap the positions of least number//
      	      				arr1[position] = arr1[i];
            				arr1[i] = smallerNumber;
				}
			System.out.println("Output is");			
			display(length,arr1);					//output being displayed by function display()// 
			break;
		}
		catch (InputMismatchException e)				//executes any code within {...} if exception occur//
		{
		System.out.println("Error Encountered please enter correct input");
		}
		
	}			
    }
 public static void display(int p,int arr2[])					//pass values into display()// 
     {   
	for(int l:arr2)						
        	{
			System.out.print(l);
			System.out.print(", ");
		}
         
     }
}
 									


//scanner has particular syntax which needs to be addresed and also array need its length initialized else initialize it to null java is case sensitive therefore be carefull of what is being typed in int values cannot be done in anything else than scanner if it is done it should be typecasted into the required data type//
