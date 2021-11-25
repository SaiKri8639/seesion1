public class AmstromgNumb 
{
 public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	for(int i=1;i<4;i++) {
	System.out.println("enter any number: ");
	int n = sc.nextInt();
	int temp=n, rev=0, rem;
	while(n>0)
	{
		rem= n%10;
		n=n/10;
		rev =rev+(rem*rem*rem);
	}
	if(temp==rev)
	{
		System.out.println(temp +"is an amstromg number:");
	}
	else
	{
		System.out.println(temp +"is not an amstromg number:");
	}
  }
  }
}