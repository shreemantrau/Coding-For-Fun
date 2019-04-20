package practice2;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class frequency_of_numberinan_array
{
	public static void main (String[] args)
	{
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("The entered number is: "+number);
		
		HashMap<Integer,Integer>freq=new HashMap<Integer,Integer>();
			while(number != 0)
			{
				int lastdigit=number%10;
				if(freq.containsKey(lastdigit))
				{
					freq.put(lastdigit,freq.get(lastdigit)+1);
				}
				
				else
				{
					freq.put(lastdigit,1);
				}
				
				number=number/10;
			}
			
			  System.out.println("===================");
		         
		        System.out.println("Digits : Frequency");
		         
		        System.out.println("===================");
		         
		        Set<Integer> keys = freq.keySet();
		         
		        for (Integer key : keys) 
		        {
		            System.out.println("   "+key+"   :   "+freq.get(key));
		        }
		         
		        sc.close();
	}
}	
