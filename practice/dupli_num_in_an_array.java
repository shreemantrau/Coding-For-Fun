package practice2;

public class dupli_num_in_an_array 
{
	public static void main(String[] args)
	{
		boolean x=true;
	    int[] a={1,2,3,3,5,6,7,8,9};
	    int i = 0,j=0;
	    System.out.println("hi");
	    while(i<a.length)
	    {
	    for( i=j+1;i<a.length;i++)
	    {
	    	if(a[i]==a[j])
	    	{
	   
	    		System.out.println("The duplicate element is "+a[i]);	
	    		x=false;
	    		i=a.length;
	    		break;
	    	}
	    	
	    	j++;
	    }
	    
	    
	    }//end of while
	    
	    if(x==true)
	    {
	    	System.out.println("The array doesnt not have any duplicates");
	    }
	    
	   
	}
}
