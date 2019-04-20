package practice;

public class de
{
	public static void main(String [] args)
	{
		String[] str={"abc","egf","abc","qwe","weq"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j] && i!=j)
				{
					System.out.println("Duplicate elements is "+str[j]);
				}
			}
		}
	}
}
