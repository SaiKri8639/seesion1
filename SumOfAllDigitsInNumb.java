public class SumofAllDigtInNumb 
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   for(int i=1;i<4;i++) {
   System.out.println("enter the number: ");
   int n = sc.nextInt();
   int sum=0,rem;
   while(n>0)
   {
	   rem=n%10;
	   n=n/10;
	   sum=sum+rem;
   }
   System.out.println(sum);
   }
 }
}