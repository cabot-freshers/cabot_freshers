import java.util.Scanner;
 
class Akhila_Search 
{
	static Scanner input = new Scanner(System.in);
	static String userInput = null;

	public static void main(String args[])
	{
    
		Search();
		while (true)
        	{
			System.out.print("Do You Want to Continue (Y/N) ?");
            		userInput = input.next();
            		if (userInput.equalsIgnoreCase("Y"))
                	Search();
            		else if (userInput.equalsIgnoreCase("N"))
            		{
                		System.out.print("Thank you !!");
                		break;
            		}	
            		else
			{
                            System.out.print("***Invalid Choice***\n");   
            		}

        	}

	}


	public static void Search()
	{
 		int i,a,num,Y,search,array[];
    		int count=0;
 
		System.out.println("Enter number of elements");
    		while(!input.hasNextInt())
		{
			input.next();
			System.out.println("Enter a valid input\n");
		}
		num = input.nextInt(); 
		array = new int[num];
		 
		System.out.println("Enter " + num + " integers");
 
    		for (i = 0; i < num; i++)
     		{
	
     			System.out.println("Enter number "+(i+1)+"\n");
			while(!input.hasNextInt())
			{
				input.next();
				System.out.println("Enter a valid input\n");
			}


		      array[i] = input.nextInt();
		}
    		System.out.println("Enter value to find");
		while(!input.hasNextInt())
		{
			input.next();
			System.out.println("Enter a valid input\n");
		}
    		search = input.nextInt();
 
		for (i = 0; i < num; i++)
	    	{
	      		if (array[i] == search)     /* Searching element is present */
	      		{
         			System.out.println(search + " is present at location " + (i + 1) + ".");
				count++;
       			}

   		}

   		if (count==0) /* Searching element is absent */
      		System.out.println(search + " is not present in array.");
  		else
      		System.out.println(search +" is present "+count+" times in array\n");
 	 }

}
