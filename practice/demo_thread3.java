package practice2;

 class demo_thread3
{
	static int count=0;
	public static synchronized void count_checker()
	{
		count++;
	}
	public static void main(String[] args)
	{
		//demo_thread3 dt=new demo_thread3();
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10000;i++)
				{
					count_checker();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10000;i++)
				{
					count_checker();
				}
			}
		});
		
		t1.start();
		t2.start();
		//System.out.println(count);//in this case the count is getting printed before the threads finish the for loop
		// to recctify it we will use th join method
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
		
	}
}