package exceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutOfBoundExp
{
  public static void main(String[] args)
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter the array size: ");
	 int size = sc.nextInt();
	 int arr[] = new int[size];
	 System.out.println("enter the elements: ");
	 for(int i=1;i<size;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
     System.out.println(Arrays.toString(arr));
//	 for(int a1 : arr)
//	 {
//		 System.out.print(a1+" ");
//	 }
     System.out.println("enter the index number to get element:");
	 try
	 {
		 
		 int n1 = sc.nextInt();
		 System.out.println("the element in the index is: "+arr[n1]);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		System.out.println("invalid index number please provide correct index number: "); 
	 }
	 
  }
}
