package practice2;

class thread implements Runnable
{
	private boolean flag = true;

	public void call() {
		flag = false;
	}

	@Override
	public void run() {
		while (flag==true)
		{
			System.out.println("I'm running.... ");
		}

		System.out.println("I am not running");
	}

}

public class thread_stop
{
	public static void main(String[] args)
	{
		thread_stop ts=new thread_stop();
		Thread t1 = new Thread(new thread());//when class imeplements Runnable
		//thread t1=new thread();//when class extends Thread
		thread threader=new thread();
		threader.call();
		t1.start();
		
		try
		{
			class1.sleep(100);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threader.call();
	}	
}
