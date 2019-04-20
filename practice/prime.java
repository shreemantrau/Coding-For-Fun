package practice2;
import java.util.*;
public class prime
{
	public static void main(String [] args)
	{
		System.out.println("Enter the number which yo want to check");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		int temp;
		boolean x=true;
		
			for(int i=2;i<b;i++)
			{
				if (b==0)
				{
					System.out.println(b+" is a Prime Number");
					break;
				}
				
				if (b==1)
				{
					System.out.println(b+" is a Prime Number");
					break;
				}
				
				if (b==2)
				{
					System.out.println(b+" is a Prime Number");
					break;
				}
				temp=b%i;
				if(temp==0)
				{
					x=false;
					break;
				}
			}
			
			if(x==true)
			{
				System.out.println(b+" is a Prime Number");
			}
			
			if(x==false)
			{
				System.out.println(b+" is not a Prime Number");
			}
				
			
		
	}
}
