//Interface
//Author : Dino Sunny
import java.io.*;
interface toy
	{
		public void color();
		public void shape();
	}
class Types implements toy
	{
  		public void color()
  		{
   		System.out.println("My color is red");
  		}
  		public void shape()
  		{
      		System.out.println("Regular");
 	 }
public static void main(String args[])
 		{
     		toy t= new Types();
      		t.color();
      		t.shape();
  		}
	}
