package practice2;

import java.io.IOException;
import java.util.Scanner;

public class harshad_number 
{
	public static void main(String[] args)
	{		
		harshad_number h=new harshad_number();
		h.harshad();
		
	}
	
	public void harshad()
	{
		char b;
		do
		{
		
		System.out.println("Please enter the number you want to check");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("The number you have entered is..." +a);
		
		int sum=0;
		int new_a=a;
		
		
			
			while(new_a!=0)
				{
				sum=sum+new_a%10;
				new_a=new_a/10; 
				}	
		
		
		
		if(a%sum == 0)
		{
			System.out.println("The number which you have entered is an HARSHAD number");
		}
		
		else
		{
			System.out.println("The number which you have entered is NOT an HARSHAD number");
		}
		System.out.println("Do you want to check any another number?(y/n)");
		Scanner scan=new Scanner(System.in);
		b=scan.next().charAt(0);
		
		}
		while(b=='y'||b=='Y');
	}
}
