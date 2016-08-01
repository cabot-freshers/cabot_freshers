import java.util.Scanner;

public class Akhila_CountSort /* Creating class CountSort*/
{
	private static final int MAX_RANGE=1000000; /* setting maximum range value*/

public static void sort(int[] array) /* Sort function*/
{

	int N = array.length; /* Length of array is assigned to N */
	if(N==0)
	return;



	int max=array[0], min=array[0]; /* checking max & min */ 

	for(int i=1;i<N;i++)

	{

		if (array[i]>max)
		max=array[i];
		if (array[i]<min)
		min=array[i];
	}

	int range=max-min+1; /* range is obtained */

	if (range>MAX_RANGE) /* checking whether range is in limit */
	{
		System.out.println("Range is too large\n"+ range);
		return;
	}


	int[] count= new int[range]; /* setting count */



	for(int i=0;i<N;i++)
	count[array[i]-min]++;



	for(int i=1;i<range;i++)  /* setting new count */

	count[i]= count[i]+count[i-1];


  
	int j=0;

	for(int i=0;i<range;i++) /* setting result */
	{
		while (j<count[i])
		array[j++]=i+min;
	}
}

public static void main(String[] args) throws Exception/* Main function */
{
	System.out.println("COUNT SORT\n");

	while(true)
	{
			 Scanner input = new Scanner(System.in); /* object input is created*/
			 
			int num,i;
			try
			{
			
			System.out.println("Enter number of integers to be sorted\n"); /* how many numbers to be sorted */
			while(!input.hasNextInt())
			{
				input.next();
				System.out.println("**Enter a valid input**\n");
			}

			while(!input.hasNextInt())
			{
				input.next();
				System.out.println("**Enter a valid input**\n");
			}


			num=input.nextInt();
			
				if (num==0)
				{
				
				System.out.println("*You can enter only positive integer*\n");
				continue;				
				}

			int array[]=new int[num]; /* created an array*/
			
		
			
			System.out.println("Enter "+num+" integer elements\n");
			
			for(i=0;i<num;i++)
			{
			
			System.out.println("Enter number"+(i+1)+"\n");
					
			while(!input.hasNextInt())
			{
				input.next();
				System.out.println("Enter a valid input\n");
			}
			
			array[i]=input.nextInt(); /* accepting the input */
			
			}
			sort(array); /* calling sort function */


			System.out.println("Elements after SORTING\n");

			for(i=0;i<num;i++)
			{
			System.out.println(array[i]+" "); /* printing sored elements */
			}
			break;

			
		}
		catch (Exception e)
		{
			System.out.println("INVALID DATA\n*************\n");
			
		}
	}
}
}
