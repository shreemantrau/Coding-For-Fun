package practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class fileread
{
	public static void main(String[] args)
	{
		File f= new File("C:\\Users\\Shreyas\\Desktop\\netlogo assignment.txt");
		Scanner s=null;
		try
		{
			 s=new Scanner(f);
			while(s.hasNextLine())
			{
				System.out.println(s.nextLine());
			}
		}
		catch(FileNotFoundException n)
		{
		  n.printStackTrace();
		}
		
	}
	
	
}