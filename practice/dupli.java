package practice;
import java.util.*;

class dupli
{

	public static void main(String[] args)

	{
		String s=("India is a cool place with so much diversity and unity");
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j] && j<i)
				{
					break;
				}
				if(c[i]==c[j])
				{
					count++;
				}
				
				if(j==c.length-1)
				{
				System.out.println("The character "+c[i]+" appers "+count+" times");
				}
			}
				
		}
	}
}