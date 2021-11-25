public class MaxAndMinElement
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("size of an array: ");
  int size = sc.nextInt();
  int arr[] = new int[size];
  System.out.println("enter the values :");
  for(int i=0;i<arr.length;i++)
  {
	  arr[i]=sc.nextInt();
  }
 // int n = sc.nextInt();
  int max = arr[0];
  for(int i=1;i<arr.length;i++)
  {
	  if(arr[i]>max)
	  {
		  max=arr[i];
	  }
	  //return max;
  }
  int min =arr[0];
  for(int i=1;i<arr.length;i++)
  {
	  if(arr[i]<min)
	  {
		  min=arr[i];
	  }
  }
  System.out.println(max + " -max element in an array:");
  System.out.println(min + " - min element in an array:");
 }
}
