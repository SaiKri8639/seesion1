package threadsCreationAndManagement;

// creating Thread by using Lambda Expressions
public class FourthWayThreadCreation 
{
	public static void main(String[] args) {

  Thread thread = new Thread(()->{
	 
	  System.out.println("*********[task] started working");
	  for(int i=0;i<10;i++)
	  {
		  System.out.println(i);
	  }
	  System.out.println("********[task] stoped working");
  });
     thread.start();
}
}