//Binary search
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Angitha_BinarySearch 
{
    public static void main(String[] args) throws Exception 
    {
    
    int c, first,n, last, middle,search, array[],smallerNumber,i,j,position;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       while(true)
         { 
             	try 
    	 	{  
   
        
    System.out.println("Enter the limit");
    String limit = reader.readLine();    

    n = Integer.parseInt(limit); 
   
    array = new int[n];
    
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++)
    {
    	String element = reader.readLine();
        array[c] =Integer.parseInt(element);
    }      
    
    //===============================================
   
				for (i = 0; i < n-1; i++)		
       				{
            				position = i;
           				for (j = i + 1; j < n; j++)		
					{                		
						if (array[j] < array[position])
                    				{
							position = j;		
      						
						}
					}				
					smallerNumber = array[position]; 	
      	      				array[position] = array[i];
            				array[i] = smallerNumber;
				}
    
    
    
    //===============================================
    
    System.out.println("Enter value to find");
    String srch = reader.readLine();
    search = Integer.parseInt(srch);
 
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
      
   }
		catch (Exception e)
		{ 
		    System.out.println(e);
		   
		    
	        }   
       	   
	}//end while  
      
    
  }//end main
}//end class
