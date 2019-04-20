package practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class union_intersectionof_multiple_arrays 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements do  you want in your 1st array ");
		int a=sc.nextInt();
		System.out.println("Enter how many elements do you want in your 2nd array");
		int b=sc.nextInt();
		
		
		int[] array1=new int[a];
		int[] array2=new int[b];
		
		//taking input
		System.out.println("Enter all the numbers in your first arrays");
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter all the numbers in your second arrays");
		for(int i=0;i<array2.length;i++)
		{
			array2[i]=sc.nextInt();
		} 
	
		//printing
		System.out.println("\n The first array which you have entered is as follows \n");
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println("\n The second array which you have entered is as follows \n");
		for(int i=0;i<array2.length;i++)
		{
			System.out.print(array2[i]+" ");
		}
		
		int array3[]=new int[2];
		System.out.println("\nEnter 2 elements in the next array");
		
		for(int i=0;i<array3.length;i++)
		{
			array3[i]=sc.nextInt();
		}
		
		union_intersectionof_multiple_arrays u=new union_intersectionof_multiple_arrays ();
		u.union(array1,array2,array3);
	}//end of main
	
	public void union(int []...a)
	{
		HashSet<Integer>unionset=new HashSet<Integer>();
		for(int i[]:a)
		{
			for(int j:i)
			{
				unionset.add(j);
			}
		}
		
		System.out.println("Thee union of the above entered rray is:"+unionset);
	}//end of union
}
