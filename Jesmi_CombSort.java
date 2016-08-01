import java.util.*;
public class CombSort { 
	
	public static void sort(int[] array, int size) {// This function sorts a list in-place using CombSort
	int gap = size; // The distance between elements being compared
        boolean swapped = true; 
	if(gap<1)
		gap=1;
      
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int)(gap / 1.3); // 1.3 is the shrink factor
		
            }
         
           int i = 0;
           swapped = false;
           while (i + gap < size) {
                if (array[i] > array[i+gap]) {// If the first number is bigger than the second, swap them.
		    int temp=array[i];
		    array[i]=array[i+gap];
		    array[i+gap]=temp;
                    swapped = true;
                }
                i++;
            }
        } 
  } 
	public static void main(String[] args) {
   	while(true){
    			try{
    				Scanner s=new Scanner(System.in);

    				System.out.println("Enter number of elements");
    				while (!s.hasNextInt()){        
    				
    					System.out.print("Please enter a positive integer! "); // Re-prompt
					s.next(); // Read and discard offending non-int input
				}
    				int n=s.nextInt();
				if(n==0 || n==' '){
					System.out.println("Please enter a positive integer!");
					continue;
				}
    				int list[]=new int[n];
    
   	 			for(int i=0;i<n;i++){//for reading array
				System.out.print("Enter element "+(i+1)+": ");
         			while (!s.hasNextInt()){        
    					s.next(); // Read and discard offending non-int input
    					System.out.print("Please enter an integer! "); // Re-prompt
				}
	
        			list[i]=s.nextInt();

    				}
       

    				sort(list, n);
    				System.out.println("Sorted array is:");
    				for(int i=0;i<n;i++)
    				System.out.println(list[i]);
    	
    				break;        
    			}catch (Exception e){
  			System.out.println("Please enter positive integers");
	
            
			}        
		}
	}
 
} 

