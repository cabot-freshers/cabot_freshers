import java.io.*;
import java.util.Scanner;

class LinearSearch
 {
   public void intSearch(int[] inputArray,int limit)
    {
      char c;
      int pos=-1,num,i,succ=1,k=0;
      Scanner ipt = new Scanner(System.in);
      do
       {
         k=0;
         System.out.println("Enter the number: ");
         while (!ipt.hasNextInt() && k <= 3)
          {        
            ipt.next(); // Read and discard offending non-int input
            System.out.println("Please re-enter an integer: "); // Re-prompt
            k=k+1;
          }
         if(k!=4)
          {
            num = ipt.nextInt(); 
            for(i=0;i<limit;i++)
             {
               if(inputArray[i]==num)
                  { pos=i; break; }
             }
            if(pos!=-1)
              System.out.println("The number is "+inputArray[pos] + " @ position: " + (pos+1));
            else
              {
                System.out.println("The number is not present in the array");
              }
          }
         else
            System.out.println("you hav tried my patience");
       k=0;
       do{
        System.out.print("Do you want to continue(y/n):");
        c = ipt.next().charAt(0);
        if(c == 'y'||c== 'Y')
            succ=1;
        else if(c=='n'||c=='N')
           { succ=0;break; }
        else
          {
            System.out.println("You hav entered the wrong input. Try again");
          }
        }while(succ!=1);
      }while(succ==1);
  }
}


class Noyal_LinearSearch
 {
   public static void main(String args[])
    {
      int succ=1;
    try
     {
      do
       {
         int k=0;
         LinearSearch ls = new LinearSearch();
         Scanner ipt = new Scanner(System.in);
         //user definded limit
         System.out.print("Enter the limit: ");
         while (!ipt.hasNextInt() && k <= 5)
            {        
                    ipt.next(); // Read and discard offending non-int input
                    System.out.print("Please enter an integer: "); // Re-prompt
                    k=k+1;
            }
         if(k!=6)
          {
            int limit = ipt.nextInt();
            if(limit==0)
                {
                  System.out.println("Enter a proper limit");
                  break;
                }
            int[] inputArray = new int[limit];
            //Input from user to array
            System.out.println("Enter the array elements:");
            for(int i=0;i<limit;i=i+1)
              {
                while (!ipt.hasNextInt())
                 {        
                   ipt.next(); // Read and discard offending non-int input
                   System.out.print("Please enter an integer: "); // Re-prompt
                 }
                inputArray[i]=ipt.nextInt();
              }
             succ=0;
            //calling the linearSearch function
            ls.intSearch(inputArray,limit);
         }
        else
          { 
            System.out.println("you hav tested my patience");
            break;
          }
       }while(succ!=0);
    }catch(Exception e){System.out.println("Invalid Input");}
  }
 }


