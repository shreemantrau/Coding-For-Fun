package practice;
import java.util.Scanner;
//using multiple objects
/*
public class linklist 
{
  linklist link;
  int data;
  
  public linklist()
  {
	  this.link=null;
  }
}

 class demo
 {
	 public static void main(String[] args)
	 {
		 linklist fn=new linklist();
		 linklist sn=new linklist();
		 linklist tn=new linklist();
		 
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the number for first node");
		 fn.data=s.nextInt();
		 System.out.println("Enter the number for first node");
		 sn.data=s.nextInt();
		 System.out.println("Enter the number for first node");
		 tn.data=s.nextInt();
		 
		 //
		 System.out.println("The entered values of all the nodes are as follows"+fn.data+" "+sn.data+" "+tn.data);
		 
		 fn.link=sn;
		 sn.link=tn;
		 
		 while(fn!=null)
		 {
			 System.out.println(fn.data+"->");
			 fn=fn.link;
		 }
		 
		 System.out.println("Null");
	 }
	
 }
	*/





/*
//using single object

class linklist
{
	int data=0;
	linklist link;
	
	public linklist()
	{
		this.link=null;
	}
}




class demo
{
	public static void main(String[] demo)
	{
		linklist fn= new linklist();
		//linklist sn= new linklist();
		//linklist tn= new linklist();
		 fn.link=new linklist();
		 fn.link.link=new linklist();
		// getting the data
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the data for first node");
		fn.data=s.nextInt();
		System.out.println("Enter the data for the second node");
		fn.link.data=s.nextInt();
		System.out.println("Enter the data forthe third node");
		fn.link.link.data=s.nextInt();
		//linking nodes
		
		//fn.link=sn;
		//sn.link=tn;
		//tn.link=null;
		
		//displaying data in the nodes
		//System.out.println("The data of all te nodes are as follows "+fn.data+" "+sn.data+" "+tn.data);
	    //System.out.println("link of fn is "+fn.link.data+"\n sn is"+sn.link.data+"tn is "+tn.link );
	    
	    //display loop
	    while(fn!= null)
	    {
	    	System.out.println(fn.data+"->");
	    	fn=fn.link;
	    }//end of display while
	    
	    System.out.println("Null");
	}
}

*/

class linklist
{
	int data;
	linklist link=null;
	
	public linklist()
	{
		this.link=null;
	}
		
}
class demo

{
	public static void main(String[] args)
	{
		
	linklist s=new linklist();
	linklist t=s;
	
	Scanner x=new Scanner(System.in);
	//System.out.println("Enter the data of the first node");
	//s.data=x.nextInt();
	int u=5;
	int y=5;
	while(u==y)
	{
		System.out.println("How many nodes do you want to have?");
		//char c=x.next().charAt(0);
		int i;
		int c=x.nextInt();
		int b=c;
		if(c>0)
		{	
		for( i=1;i<=b;i++)
		{
		
			
			linklist n=new linklist();
			System.out.println("Enter the data of the node number "+i);
			n.data=x.nextInt();
			s.link=n;
			s=n;
		}// end of for
		y=6;
		}//end of if 	  
		
		else
		{
			break;
		}// end of else
	
			
	}//end of while
	
	s=t;
	while(s!=null)
	{
		System.out.println("Linklist is "+s.data+"\t");
	    s=s.link;
	}

	
		
		
  }//end of public static...	
}//end of class	