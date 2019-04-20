package practice;
import java.util.*;

public class abcd
{
	public static void main(String[] args)
	{
		String[] things={"Games","PS4","Tesla","airticket"};
		List<String> l1=new ArrayList<String>();
		List<String>l2= new ArrayList<String>();
		String[] things2={"Games","PS4"};
		for(String x: things)
		{
			l1.add(x);
			
		}
		
		for(String g: things2)
		{
			l2.add(g);
		}
		
		for(int j=0;j<l1.size();j++)
		{
			System.out.print(" "+l1.get(j));
		}
		
		for(int c=0;c<l1.size();c++)
		{
			System.out.print(" "+l1.get(c));
		}
		
		abcd l=new abcd();
		l.editlist(l1,l2);
		
		
		
	}
	
	public static void editlist(List<String> list1, List<String> list2)
	{
		Iterator<String> it= list1.iterator();
		while(it.hasNext())
		{
			if(list2.contains(it.next()))
			{
				it.remove();
			}
		}	
			System.out.println("After removing the same items from the list we get");
			
			for(int b=0;b<list1.size();b++)
			{
				System.out.print(" "+list1.get(b));
				
			}
	}
}	

