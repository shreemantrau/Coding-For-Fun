package practice;

public class twoarraysaresimilar
{
	public static void main(String[] args)
	{
		int [] a={1,2,3,4,5};
		int [] b={1,1,3,4,5};
		int p=0;
		int i=0;
		int j=0;
		int count=0;
		int lena=a.length;
		int lenb=b.length;
		boolean q=true;
		
	while(q!=true)
	{
		if(lena != lenb)
		{
			q=false;
		}
		for( i=0;i<a.length;i++)
			count=0;
		{
			for( j=0;j<lenb;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
				if(count==0)
				{
					
					q=false;
					p=7;		
				}
		}
	}
	
	
	if(q==false)
	{
		System.out.println("Arrays are not similar");
		
	}
	
	else
	{
		System.out.println("Arrays are similar");
	}
	
	}
	
}
