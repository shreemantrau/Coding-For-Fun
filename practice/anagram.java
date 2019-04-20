package practice;
import java.util.*;

class anagram
{
	public static void main(String[] args)
	{
		String s0="shreyas";
		String s1="sreashy";
	    anagram a= new anagram(); 
		
		a.check_anagram(s0,s1);					
	}
	
	public void check_anagram(String a, String b)
	{
		
		char[] afroms1=a.toCharArray();
		char[] afroms2=b.toCharArray();
		Arrays.sort(afroms1);
		Arrays.sort(afroms2);
		Arrays.equals(afroms1,afroms2);
		//Arrays.equals(afroms1,afroms2);
	    if(Arrays.equals(afroms1,afroms2)== true)
		System.out.println("Anagram detected");
	    else
	    {
	    	System.out.println("Anagram not detected");
	    }
		
	}
}