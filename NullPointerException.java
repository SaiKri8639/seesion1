package exceptionHandling;

import java.util.Scanner;

public class NullPointerExp
{
 public static void main(String[] args)
 {
     
	 try
  {
//		 int arr[]=null;
//		 System.out.println(arr.length);
     Scanner sc = null;	
     sc.nextInt();
     if(sc.equals(sc.nextInt()))
     {
    	 System.out.println("enter the data: ");
     }
     else
     {
    	 System.out.println("Print the exception: ");
     }
  }
	 catch(NullPointerException ex)
	 {
		 System.err.println("Null Pointer exception occurs:");
	 }
 }
}
