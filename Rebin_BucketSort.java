import java.io.*;
import java.util.*;

class Calculate{

	static int[] sort(int[] sequence, int maxValue){			//The Bucket Sorting function
		// Bucket Sort
		int[] Bucket = new int[maxValue + 1];

//		for(int i=0;i<Bucket.length;i++)
//			System.out.print(Bucket[i]+" ");
//		System.out.print("\n");

		int[] sorted_sequence = new int[sequence.length];		//Array to store the result

//		for(int i=0;i<sorted_sequence.length;i++)
//			System.out.print(sorted_sequence[i]+" ");
//		System.out.print("\n");

		for (int i = 0; i < sequence.length; i++)			//Filling the buckets
			Bucket[sequence[i]]++;

		int outPos = 0;

		for (int i = 0; i < Bucket.length; i++)	
			for (int j = 0; j < Bucket[i]; j++)
				sorted_sequence[outPos++] = i;

		return sorted_sequence;
	}

	static void printSequence(int[] sequence){			//To print the sequence
		for (int i = 0; i < sequence.length; i++)
			System.out.print(sequence[i] + " ");
		System.out.print("\n");
	}

	static int maxValue(int[] sequence){				//To find the highest value in the sequence
		int maxValue = 0;

		for (int i = 0; i < sequence.length; i++)
			if (sequence[i] > maxValue)
				maxValue = sequence[i];

		return maxValue;
	}
}

class Rebin_BucketSort{
	public static void main(String args[])throws Exception{

		int n,i;
		while(true){
			try{
				System.out.println("Enter the number of numbers: ");

				Scanner kb = new Scanner(System.in);

				n = kb.nextInt();

				int[] sequence = new int[n];

				System.out.println("Enter the numbers: ");

				for(i = 0; i < n; i++){
					// Repeat until next item is an integer
					while (!kb.hasNextInt()){
					    kb.next(); // Read and discard offending non-int input
					    System.out.print("You can only enter a positive integer. Retry. \n"); // Re-prompt
					}

						// At this point in the code, the user has entered an integer
						sequence[i] = kb.nextInt();  // Get the integer
						if(sequence[i]<0){
							System.out.print("You can only enter a positive integer. Retry. \n");
							i--;
							continue;
						}
				}

				Calculate c = new Calculate();
				int maxValue = c.maxValue(sequence);				//Maximum value in the sequence
				System.out.println("\nOriginal Sequence: ");
				c.printSequence(sequence);						//To print the original sequence
				System.out.println("\nSorted Sequence: ");
				c.printSequence(c.sort(sequence, maxValue));			//To print the sorted sequence
				return;
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
}
