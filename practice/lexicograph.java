package practice;
import java.util.*;

class  lexicograph
{
	public static void main(String[] args)
	{
		String s1="shreyas";
		String s2="Karandikar";
		String s3="shreyas";	
		
		int a=s1.compareTo(s2);
		System.out.println(a);
		
		 a=s1.compareTo(s3);
		 System.out.println(a);
		 a=s2.compareTo(s3);
		 System.out.println(a);
	}
}
