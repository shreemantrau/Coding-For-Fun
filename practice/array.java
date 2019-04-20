package practice;
import java.util.*;


public class array 
{
	public static void main(String [] args)
	{
		int a,i,b,c,d,e,f,total_sum=0,givenarray_sum=0;
		
		for(i=1;i<=6;i++)
		{
			
			 total_sum=total_sum+i;
		
		}
		
		System.out.println("The total sum is "+total_sum);
	
	int []missingarray={1,3,4,5,6};
	for(c=0;c<missingarray.length;c++)
	{
		System.out.println(c);
	}
	
	for(c=0;c<missingarray.length;c++)
	{
		givenarray_sum=givenarray_sum+missingarray[c];
	}
	System.out.println("The sum of the given array is"+givenarray_sum);
	
	f=total_sum-givenarray_sum;
	System.out.println("The missing element is "+f);
//for larger numbers it will take a significant amount of time 
/// so we can use the formula n*(n+1)/2 to give the sum of the array and then subtracting
//from the array who has a missing element.
	
	}//end of main
	
	
}
