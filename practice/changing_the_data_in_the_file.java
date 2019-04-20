package practice2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class changing_the_data_in_the_file 
{
	public static void main(String[] args)
	{
		changing_the_data_in_the_file c=new changing_the_data_in_the_file();
		String filepath="C:\\Users\\Shreyas\\Desktop\\to-do.txt";
		String old="";
		String newstring="";
	}
	
	static void modify_data(String filepath,String old,String newsstring)
	{
		File f=new File(filepath);
		BufferedReader r=null;
		FileWriter w=null;
		try
		{
			r=new BufferedReader(new FileReader(filepath));
		    String line=r.readLine();
		    
		    while(line!=null)
		    {
		    	old=old+line+System.lineSeparator();
		    	line=r.readLine();
		    }
		    
		    String newstring=old.replaceAll(old, newstring);
		    FileWriter writer;
		    writer=new FileWriter(f);
		    writer.write(newContent);
		}
	}
}
