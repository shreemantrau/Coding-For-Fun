package practice;


class permutations
{
	public static void perm1(String q)
	
	{
		perm2("",q);
	}
	
	public static void perm2(String a, String b)
	{
		if(b.length()<=0)
		{
			System.out.println(a);
		}
			
		if(b.length()>0)
		{
			for(int i=0;i<b.length();i++)
			{
				perm2(a+b.charAt(i),b.substring(0, i)+b.substring(i+1,b.length()));
			}
		}
		
	}
	
	public static void main(String [] args)
	{
		perm1("bat");
	}
}