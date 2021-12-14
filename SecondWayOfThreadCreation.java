package threadsCreationAndManagement;


// Second way of 
public class SecondWayOfThreadCreation 
{

	public static void main(String[] args)
	{
		SecondThread secondTask = new SecondThread();
		Thread thread = new Thread(secondTask);  //Creating a thread by using runnable object
		thread.start();
		Thread thread1 = new Thread(secondTask);  //Creating a thread by using runnable object
		thread1.start();
	}
}
	class SecondThread implements Runnable
	{
    	String id="Thread";
		static int instance_number=0;
		@Override
		public void run()
		{
			// TODO Auto-generated method stub
			System.out.println("****["+id+" Started working****");
			for(int i=0;i<10;i++)
			{
				System.out.println("<"+id+">"+i);
			}
			System.out.println("****["+id+" Stopped working****");
		}
		public SecondThread()
		{
//			this.start();
		}
	}