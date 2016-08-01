import java.io.*;
import java.util.*;

class LinearSearch{
	public static void main(String args[])throws Exception{

		int n,i,num,flag = 0;
		try{
			System.out.println("Enter the number of numbers: ");

			Scanner kb = new Scanner(System.in);

			n = kb.nextInt();

			int[] arr = new int[n];

			System.out.println("Enter the numbers: ");

			for(i = 0; i < n; i++){

				// Repeat until next item is an integer
				while (!kb.hasNextInt()){
				    kb.next(); // Read and discard offending non-int input
				    System.out.print("You can only enter integers. Retry. \n"); // Re-prompt
				}

					// At this point in the code, the user has entered an integer
					arr[i] = kb.nextInt();  // Get the integer
			}


			System.out.println("Enter the number to be searched: ");

			// Repeat until next item is an integer
			while (!kb.hasNextInt()){
			kb.next(); // Read and discard offending non-int input
			System.out.print("You can only enter integers. Retry. \n"); // Re-prompt
			}

			// At this point in the code, the user has entered an integer
			num = kb.nextInt();  // Get the integer

			for(i = 0; i < n; i++)
				if(arr[i]==num){
					System.out.println("Found at position :"+ (i+1));
					flag = 1;
				}
			if(flag==0)
				System.out.println("Not found.");

		}
		catch(NegativeArraySizeException e){
			System.out.println("Size of your array cannot be negative.\n");
		}
		catch(InputMismatchException e){
			System.out.println("Input can only be positive integers.\n");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter only positive integers.\n");
		}
	}
}
