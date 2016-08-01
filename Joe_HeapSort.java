   //Java Program to Implement Heap Sort
import java.util.*;
// Class HeapSort 
   public class Joe_HeapSort{    
      private static int N;
//Sort Function 
   public static void sort(int arr[]){       
     heapify(arr);        
      for (int i = N; i > 0; i--){
      swap(arr,0, i);
      N = N-1;
      maxheap(arr, 0);
      }
   }     
// Function to build a heap    
   public static void heapify(int arr[]){
      N = arr.length-1;
       for (int i = N/2; i >= 0; i--)
          maxheap(arr, i);        
   }
// Function to swap largest element in heap         
   public static void maxheap(int arr[], int i){ 
       int left = 2*i ;
       int right = 2*i + 1;
       int max = i;
       if (left <= N && arr[left] > arr[i])
       max = left;
       if (right <= N && arr[right] > arr[max])        
       max = right;
       if (max != i){
       swap(arr, i, max);
       maxheap(arr, max);
       }
    }    

// Function to swap two numbers in an array 
   public static void swap(int arr[], int i, int j){
       int tmp = arr[i];
       arr[i] = arr[j];
       arr[j] = tmp; 
   }    

// Main method 
   public static void main(String[] args){
   boolean success=false;
while(!success){
try{
   
       Scanner scan = new Scanner( System.in );        
       System.out.println("Heap Sort Test\n");
       int n, i,z;    
//Accept number of elements 
       System.out.println("Enter number of integer elements");
       n = scan.nextInt();    
if(n==0){
System.out.println("Enter valid number");
continue;
}
//Make array of n elements 
       int arr[] = new int[ n ];
// Accept elements 
       System.out.println("\nEnter "+ n +" integer elements");
       for (i = 0,z=1; i < n; i++,z++){
 	System.out.println("\nEnter No "+ z );
while (!scan.hasNextInt())
          {        
                    scan.next(); // Read and discard offending non-int input
                    System.out.print("Please enter an integer: "); // Re-prompt
          }
       arr[i] = scan.nextInt();
     }
//Call method sort 
       sort(arr);
//Print sorted Array 
       System.out.println("\nElements after sorting ");        
       for (i = 0; i < n; i++)
       System.out.println(arr[i]+" ");  
       break;
 }catch(Exception e){
         System.out.println("Enter valid number");
     }  
 }
}
}

