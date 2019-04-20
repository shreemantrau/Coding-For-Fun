package practice2;

public class thread_demo
{
	public static void main(String[] args)
	{
Thread t1=new Thread(new myclass());
Thread t2=new Thread(new myclass());
t1.start();
t2.start();
}
}

class myclass implements Runnable
{

	@Override
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getId()+"Value: "+i);
	}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
