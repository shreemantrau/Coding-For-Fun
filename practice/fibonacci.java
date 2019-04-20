package practice2;

import java.util.Scanner;

public class fibonacci 
{
	public static void main(String [] args)
	{
		System.out.println("Enter the number from which you want your fibonacci series");
		Scanner s= new Scanner(System.in);
		int l=s.nextInt();
		
		System.out.println("How many numbers of the series do you want to get printed");
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		
		int n1,n2,n3,i,j;
		n1=l;
		n2=n1++;
		j=n2++;
		System.out.print(l+" "+n2);
		for(i=j;i<j+a;i++)
		{
			n3=n1+n2;
			
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	}
}
