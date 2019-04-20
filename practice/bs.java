package practice;

import java.util.Arrays;
import java.util.Scanner;

public class bs {
	public static void main(String[] args)
	{
		System.out.println("How many elements do you want in an array?");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int []bsearch=new int[p];
		
		System.out.println("Enter "+p+" numbers");
		for(int i=0;i<p;i++)
		{
			bsearch[i]=sc.nextInt();
		}
		
		System.out.println("The array which you have entered is as follows");
		for(int k=0;k<bsearch.length;k++)
		{
			System.out.println(bsearch[k]);
		}
		
		Arrays.sort(bsearch);
		System.out.println("The sorted array is as follow");
		for(int k=0;k<bsearch.length;k++)
		{
			System.out.println(" "+bsearch[k]);
		}
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		int first=0;
		int last=bsearch.length-1;
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			
			if(bsearch[mid]==key)
			{
				System.out.println("The key is found at location "+mid+1);
				break;
			}
			
			if(bsearch[mid]<key)
			{
				first=mid+1;
			}
			
			if(bsearch[mid]>key)
			{
				last=mid-1;
			}
			 mid=(first+last)/2;
		}	
			if(first>last)
			{
				System.out.println("Not found");
			}
		
		
	}

}
