   //Java Program to Implement search
import java.util.Scanner;
 
class Joe_LinearSearch 
{
  public static void main(String args[])
  {
   boolean success=false;
while(!success){
try{ 
   int c, n,z, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
if(n==0){
System.out.println("Enter valid number");
continue;
}
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0,z=1; c < n; c++,z++){
System.out.println("\nEnter No "+ z );
while (!in.hasNextInt())
          {        
                    in.next(); // Read and discard offending non-int input
                    System.out.print("Please enter an integer: "); // Re-prompt
          }  
    array[c] = in.nextInt();
 }
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
System.out.println(" Do you want to continue (Y/N) ");
                if("N".equalsIgnoreCase(in.next().trim()))
                {
                    System.exit(0);
                }  
      }
   }
   if (c == n){  /* Searching element is absent */
      System.out.println(search + " is not present in array.");
System.out.println(" Do you want to continue (Y/N) ");
                if("N".equalsIgnoreCase(in.next().trim()))
                {
                    success=true;
                }
}

  }catch(Exception e){
System.out.println("Enter valid number");
}
}
}
}
