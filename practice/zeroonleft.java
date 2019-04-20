package practice2;

import java.util.Scanner;

public class zeroonleft
{
	public static void main(String[] args)
	{
		int []a={1,0,30,0,4,0,5,6};
		/*System.out.println("Please enter the total elements you want in your array");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		int[] userarray=new int[b];
		
		for(int i=0;i<userarray.length;i++)
		{
			System.out.println("Pls enter your "+(i+1)+" number");
			int k=s.nextInt();
			userarray[i]=k;
		}*/
		zeroonleft z=new zeroonleft();
		z.right(a);
		z.left(a);
	}
	
	public void right(int[]a)
	{
		int counter=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[counter]=a[i];
				counter++;
			}
		}	
			
			while(counter<a.length)
			{
				a[counter]=0;
				counter++;
			}
		
	System.out.println("All zeros are on the right");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	}
	
	public void left(int []a)
	{
		int counter=a.length-1;
		for(int i=a.length-1;i>-1;i--)
		{
			if(a[i]!=0)
			{
				a[counter]=a[i];
				counter--;
			}
		}
		
		while(counter>-1)
		{
			a[counter]=0;
			counter--;
		}
		System.out.println("\nAll zeros are on the left");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
			
			
		
	}
}
