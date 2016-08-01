import java.io.*;
import java.util.*;

/**
* The Bubble Sort program implements an application that
* sort integer elements and display sorted elements to the standard output.
*
* @author  Catherine K G.
*/


class BubbleSort
{


 /**
   * The main method is where the bubble sort implemented.
   * @param args Unused.
   * @return Void.
   */
	public static void main(String args[])
	{
		int limit,i,j,temp;
		
		try
		{
			
			System.out.println("Please enter the number: of elements to sort");
			Scanner s=new Scanner(System.in);
			limit=s.nextInt();//Read the limit
			int array[]=new int[limit];
			if(limit>0)
			{
			
				System.out.println("Please enter the elements to sort");
				for(i=0;i<limit;i++)//Read Elements
					array[i]=s.nextInt();
		
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

				System.out.println("Sorted Array");
				for(i=0;i<limit;i++)//Display sorted Elements
					System.out.println(array[i]);
			}
			//else if(limit==0)
				
		}
		catch(Exception e)
		{
			System.out.println("Please enter positive integers");
			//s.nextInt();
			//continue;
		}

	}

}
