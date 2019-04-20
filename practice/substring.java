package practice;

public class substring 
{
	public static void main (String args[])
	{
		String s1=("Shreyas");
		String s2=("lsdyshsreasjosyas");
		int len1= s1.length();
		int len2=s2.length();
		
	
		public static boolean isRotation(String s1,String s2)
		{
			
	
		if(len1 == len2 && len1>0)
		{
			String s1s1=s1+s1;
			return isSubstring(s1s1,s2);
		}
		else
		{
			return false;
		}
		}
	}
	
}
