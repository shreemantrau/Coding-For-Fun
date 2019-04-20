package practice2;

import java.util.Scanner;

//swapping a sub string without using a thrd variable
public class swappingsubstring {
	public static void main(String[] args)
	{
		System.out.println("Enter the first string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("Enter the second string");
		String s2=sc.next();
		
		System.out.println("The first string that you have entered  is: "+s1);
		
		System.out.println("The second string that you have entered  is: "+s2);
		
		s1=s1+s2;
		System.out.println("This is the first stage: "+s1);
		
		s2=s1.substring(0,s1.length()-s2.length());
		
		System.out.println("Working on the second stage... ");
				
		s1=s1.substring(s2.length());
		
		System.out.println(s1+" \n"+s2);
				
		sc.close();
	}

}
