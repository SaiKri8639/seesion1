package threadsCreationAndManagement;

// first of creating thread is by using extends Thread
public class FirstWayOfThreadCreation 
{
	public static void main(String[] args)
	{
	  //Instantiating thread object
		FirstThread thread_0 = new FirstThread();
		System.out.println("thread_0 state :"+ thread_0.getState());
		thread_0.start();
		FirstThread thread_1 = new FirstThread();
        System.out.println("thread_1 state :"+ thread_1.getState());
        thread_1.start();//thread state is NEW
        FirstThread thread_2 = new FirstThread();
        System.out.println("thread_3 state :"+ thread_2.getState());
        thread_2.start();
	}
}

   class FirstThread extends Thread
  {
	String id = "Thread_";
	static int count = 0;
	// run() method  help us to define task to be done by thread
	public void run()
	{
	   System.out.println("****[ "+id+"Started working****");
	   for(int i=0;i<10;i++)
	   {
		   System.out.println("<"+id+">"+i);
	   }
	   System.out.println("****[ "+id+"Stopped working****");
	}
	public FirstThread()
	{
		count++;
		id=id+count;
//     to move from NEW TO RUNNABLE state
//		this.start();
	}
  }
   