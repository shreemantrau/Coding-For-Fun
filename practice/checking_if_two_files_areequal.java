package practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checking_if_two_files_areequal 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader r1=new BufferedReader(new FileReader("C:\\Users\\Shreyas\\Desktop\\file1.txt"));
		BufferedReader r2=new BufferedReader(new FileReader("C:\\Users\\Shreyas\\Desktop\\file2.txt"));
		boolean answer=true;
		int linecount=1;
		
		String line1=r1.readLine();
		String line2=r2.readLine();
		
		System.out.println("Checking yor files.... Doing your dirt work");
		
		while(line1!=null||line2!=null)
		{
			if(line1==null||line2==null)
			{
				answer=false;
				break;
			}
			
			else if(! line1.equalsIgnoreCase(line2))
			{
				answer=false;
				break;
			}
			
			line1=r1.readLine();
			line2=r2.readLine();
			linecount++;
		}
		
		if(answer==true) //or if(answer) or if(lines.equalsIgnoreCase(line2))
		{
			System.out.println("The two files are similar");
		}
		
		else
		{
			//line1=r1.readLine();
			//line2=r2.readLine();
			System.out.println("The two files are different ");
			System.out.println("The file has the line '"+line1+"' which is different than the line in file2 which is '"+line2+"' at line number "+linecount);
		}
	}
}