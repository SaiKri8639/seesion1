public class RevArray
{
 public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the array size:");
  int size = sc.nextInt();
  int arr[]= new int[size];
  System.out.println("enter the elements:");
  for(int i=0;i<arr.length;i++)
  {
	  arr[i]=sc.nextInt();
  }
  System.out.println("after reversing: ");
  //System.out.println("================");
  for(int i=arr.length-1;i>=0;i--) {
  System.out.print(arr[i]+" ");
  }
}
}
