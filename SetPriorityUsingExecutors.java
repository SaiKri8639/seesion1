package threadsCreationAndManagement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SetPriorityUsingExecutors 
{
  public static void main(String[] args) 
  {
	  ExecutorService executorServices = Executors.newFixedThreadPool(2, new SettingPriorityThreadFactory());
	  for(int i=0;i<2;i++)
	  {
		  executorServices.submit(new ThreadTasking());
	  }
	  executorServices.shutdown();
  }
}

class ThreadTasking implements Runnable
{
	String id="Thread_";
	 static int count=0; 
	 
//	 int priority;
	@Override
	public void run() 
	{
		System.out.println("******["+id+"]started working*****");
		for(int i=0;i<10;i++)
		{
			System.out.println("<"+id+">"+ i);
		}
		System.out.println("******["+id+"stopped working*****");
		// TODO Auto-generated method stub		
	}
	public ThreadTasking()
	{
		count++;
		id=id+count;
	}
}

