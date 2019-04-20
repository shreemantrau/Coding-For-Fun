package practice2;

import java.util.Arrays;

public class array_duplicate
{
	static void duplicate(int [] a)
	{
		System.out.println("The array is");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		int newarray=a.length;
		for(int i=0;i<newarray;i++)
		{
			for(int j=i+1;j<newarray;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[newarray-1];
					newarray--;
					j--;
				}
			}	
		}
		
		int[] b=Arrays.copyOf(a,newarray);
		 System.out.println("\nArray Without Duplicates : ");
         
	        for (int i = 0; i < b.length; i++)
	        {
	            System.out.print(b[i]+"\t");
	        }
	         
	        System.out.println();
	         
	        System.out.println("==============================");
	    
	}
	
	public static void main(String [] args)
	{
		duplicate(new int[] {1,2,3,4,5});
		duplicate(new int[] {1,1,2,2,3,4,5});
	}
}
