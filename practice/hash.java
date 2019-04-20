package practice;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class hash 
{
	public static void main(String[] args)
	{
		HashSet<Integer>Panther_Number = new HashSet<Integer>();
		Panther_Number.add(1022);
		Panther_Number.add(1122);
		Panther_Number.add(2222);
		//Panther_Number.remove(2222);
		System.out.println(Panther_Number);
		
		HashMap<String,Integer> SSN= new HashMap<String,Integer>();
		SSN.put("Shreyas",666666);
		SSN.put("Sharvari",77777);
		SSN.put("Khare", 54896);
		SSN.put("Komal", 412653);
		SSN.put("Rai", 452546);
		SSN.put("Gore",98452);
		
		System.out.println(SSN);
		System.out.println("Sharvari's SSN "+SSN.get("Sharvari")+" Sudeep's SSN "+SSN.get("Khare"));
		
		HashMap<String, HashSet<String>> people= new HashMap<String, HashSet<String>>();
		HashSet<String> col_friends= new HashSet<String>();
		col_friends.add("Natu");
		col_friends.add("Sudeep");
		col_friends.add("Sorte");
		people.put("Sharvari",col_friends);
		
		HashSet<String> katta_friends=new HashSet<String>();
		katta_friends.add("Shreyas");
		katta_friends.add("Khanna");
		katta_friends.add("Gore");
		katta_friends.add("Karan");
		katta_friends.add("Asif");
		System.out.println("Col Freinds of Sharvari are-" +people);
		people.put("Sharvari",katta_friends);
		System.out.println("While Katta friends are" +people);
	}
}
