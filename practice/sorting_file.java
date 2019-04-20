package practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class sorting_file
{
	public static void main(String [] args)
	{
		BufferedReader reader=null;
		BufferedWriter writer=null;
		ArrayList<String>line=new ArrayList<String>();
		
		try
		{
			
			reader=new BufferedReader(new FileReader("C:\\Users\\Shreyas\\Desktop\\f.txt"));
			String currentline=reader.readLine();
			while(currentline!=null)
			{
				line.add(currentline);
				currentline=reader.readLine();
			}
			
			System.out.println("Your file has been read successfully");
			Collections.sort(line);
		//	delay(500);
			System.out.println("Your file has been sorted successfully....Cheers");
			writer=new BufferedWriter(new FileWriter("C:\\Users\\Shreyas\\Desktop\\output.txt"));
			for(String i:line)
			{
				writer.write(i);
				writer.newLine();
			}
			System.out.println("A new file has been creted.... ");
		}
		
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try {
			reader.close();
			writer.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//writer.close();
	}
}