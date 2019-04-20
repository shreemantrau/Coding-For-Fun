package practice2;

class myclass1 implements Runnable
{

	@Override
	public void run()
	{
		int count=0;
		for (int i=0;i<100;i++)
		{
			count++;
		}
	
		try {
			Thread.sleep(100);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
				
		}
		
		System.out.println(+count);
	}
	
}
public class tthread_demo1
{
	public static void main(String [] args)
	{
	Thread t1=new Thread(new myclass1());
	Thread t2=new Thread(new myclass1());
	t1.start();
	t2.start();
	//System.out.prinlnt(count);
	}
}
