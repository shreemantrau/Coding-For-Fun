package practice2;

public class demo 
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.sum(32);
	}
	
	public void sum(int num){
		int x=num;
		int a=0;
		int b=0;
		
		while(x%10<=0)
		{
			a=x/10;
			b=x%10;
			x=a+b;
		}
		System.out.println("The output is");
	}
}
