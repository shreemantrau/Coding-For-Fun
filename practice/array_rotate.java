package practice2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class array_rotate {
	public static void main(String [] args)
	{
		array_rotate u=new array_rotate(); 
		int i=0;
		System.out.println("How many numbers do you want in an array?");
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int num[]=new int[a];
		for( i=0;i<a;i++)
		{
		System.out.println("Enter the "+(i+1)+" number");
		int b=s.nextInt();
		num[i]=b;		
		}
		for(i=0;i<num.length;i++)
		{
		System.out.print(num[i]);	
		}
		
		System.out.println("With how many numbers do you want to rotate the array?");
		int q=s.nextInt();
		u.rotate(num,q);
	} 
	
	public void rotate(int p[],int k)
	{
		if(k>p.length)
		{
			k=p.length%k;
		}
		
		int[] result= new int[p.length];
		int j=0;
		for(int i=k;i<p.length;i++)
		{
			result[i]=p[j];
			j++;
		}
		
		System.arraycopy(result,0,p,0,p.length);
		//for(intc=0c<;;)
		System.out.println("The rotated array is");
		System.out.println(Arrays.toString(p));
	}

	

}
