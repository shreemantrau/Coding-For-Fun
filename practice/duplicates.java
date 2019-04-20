package practice;
import java.util.*;

public class duplicates
{
	public static void main(String [] args)
	{
		String str=("Shreyas");
		HashMap<Character,Integer> solution=new HashMap<Character,Integer>();
		char[] test=str.toCharArray();
		
		
		for(char c:test)
		{
			if(solution.containsKey(c))
			{
				solution.put('c', solution.get(c)+1);
			}
			
			else
			{
				solution.put('c', solution.get(c=1));
			}
		}
	}
	
}