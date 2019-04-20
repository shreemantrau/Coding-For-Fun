package practice;

import java.util.*;

class triangles
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows you will like to see in the trinagle");
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		
		int i,j,k;
		
		for(i=0;i<l;i++)// rows
		{
			for(j=i;j<l;j++)//creating space before the asterix that is the left side
			{
				System.out.print(" ");
			}
			
			for(k=0;k<=i;k++)// printing
			{
				System.out.print("* ");;
			}
			
			System.out.println(" "); //going on the next line 
		}
		
	}
}