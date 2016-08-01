 /*Java program to implement search
 Input: Number of elements, element's values, value to be searched
 Output:Position of the number input by user among other numbers*/
import java.util.Scanner;
 
class Kiran_Search
{
  public static void main(String args[])
  {
	boolean success = false;
	while (!success) {
	try{
    int c, n,i, search, array[];
	int flag=0;
 	//To capture user input
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = s.nextInt(); 
	if(n==0)
	{
		System.out.println("Enter a valid data");
		continue;
		
	}
	
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
  //Loop to store each numbers in array
    for (c = 0,i=1; c < n; c++,i++)
	{
	System.out.println("Enter number"+i+":");
      
	while (!s.hasNextInt())
            {        
                    s.next(); // Read and discard offending non-int input
                    System.out.print("Please enter an integer: "); // Re-prompt
            }
	array[c] = s.nextInt();
 	}
    System.out.println("Enter value to find");
    search =s.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
	flag=1;	
         System.out.println(search + " is present at location " + (c + 1) + ".");
	 //Item is found so to stop the search and to come out of the 
            break;
	/*else if("Y".equalsIgnoreCase(s.next().trim()))
                {
                   
		continue;
                }*/  

	}

}
if(flag==0)
				{
         			System.out.println("\n The search element is not found in the array.");
       				}
System.out.println(" Do you want to continue (Y/N) ");
                if("N".equalsIgnoreCase(s.next().trim()))
                {
                    break;
                }
/* Searching element is absent */
  

}catch(Exception e){
	System.out.println("Enter a valid no");
	}
}
 
	
  }
}
