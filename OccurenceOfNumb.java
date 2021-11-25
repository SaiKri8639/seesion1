public class OccurenceOfNumb 
{
 public static void main(String[] args)
 {
	 int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array size: ");
	int size = sc.nextInt();
	int arr[] =new int[size];
	System.out.println("enter the elements : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i] =sc.nextInt();
	}
	int numb=arr[0];
	for(int i=1;i<arr.length;i++)
	{	
	if(numb==arr[i])
	{
		//count++;arr[0]=arr[i];
		System.out.println(arr[i]+"element occurence is present in the array :");
	}
	else
	{
		System.out.println("element occurence is not present in the array: ");
	}
	return;
	
	//System.out.println("number of occurence of the element: " +count);
	}
 }
}
