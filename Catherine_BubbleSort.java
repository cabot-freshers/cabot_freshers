import java.io.*;
import java.util.*;

/**
   * The Bubble Sort program implements an application that
   * sort integer elements and display sorted elements to the standard output.
   *
   * @author  Catherine K G.
   */

class Catherine_BubbleSort
{

/**
   * The main method is where the bubble sort implemented.
   * @param args Unused.
   * @return Void.
   */

	public static void main(String args[])
	{
		int limit,i,j,temp;
		int attempts = 1;
		while(attempts !=0)
		{
			Scanner s=new Scanner(System.in);
    			try
			{
    				System.out.println("Please enter the number of elements to sort");
				limit=s.nextInt();//Read the limit
				if(limit==0)
				{
					System.out.println("Sorry,Please enter positive Integer.....");
					System.out.println("--------------------------------------------------------");
					continue;
				}
				int array[]=new int[limit];
				System.out.println("--------------------------------------------------------");
				System.out.println("Please enter the elements to sort");
				
				for(i=0;i<limit;i++)//Read Elements
				{	
					System.out.println("Please enter the element" +(i+1));
					while (!s.hasNextInt())
           				{        
                    				s.next(); 
                   				System.out.println("Please enter an integer element to sort........"); // Re-prompt
						System.out.println("--------------------------------------------------------");
           			 	}
					array[i]=s.nextInt();
				}
				for(i=0;i<limit;i++)//Sort
				{	
					for(j=0;j<limit;j++)
					{
						if(array[i]<array[j])
						{
						//swap
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
						}
					}
				}
				System.out.println("--------------------------------------------------------");
				System.out.println("Sorted Array");
				for(i=0;i<limit;i++)//Display sorted Elements
					System.out.println(array[i]);
				System.out.println("--------------------------------------------------------");
				break;
    			}
			catch(Exception e)//Exception
     			{
			System.out.println("Sorry,Invalid Input.....");
			System.out.println("--------------------------------------------------------");
        		attempts++;
  			}
		}
	}
}
