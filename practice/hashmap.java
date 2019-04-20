package practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String>hp=new HashMap<Integer, String>();
		hp.put(1,"one");
		hp.put(2,"two");
		hp.put(3,"three");
		hp.put(4,"four");
		hp.put(5,"five");
		
		String x=hp.get(3);
		System.out.println(x);
		
		hp.remove(3);
		String y=hp.get(3);
		System.out.println(y);
		
		for(Map.Entry<Integer,String>entry:hp.entrySet())
		{
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key: "+key+" Value: "+value);
		}
	}

}
