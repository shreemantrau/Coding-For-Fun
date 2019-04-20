package practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class lines_words_char
{
	public static void main(String [] args)
	{
		int lc=0;
		int wc=0;
		int cc=0;
		
		BufferedReader reader=null;
		System.out.println("This program will print the total number of lines, words and characters");
		try
		{
			reader=new BufferedReader(new FileReader("C:\\Users\\Shreyas\\Desktop\\to-do.txt"));
			String linereader=reader.readLine();
			while(linereader!=null)
			{
				lc++;//updating the total lines
				String[] words=linereader.split(" ");
				wc=wc+words.length;
				
				for(String i:words)
				{
					cc=cc+i.length();
				}
				linereader=reader.readLine();
			}
			
			System.out.println("Total number of Lines in the file are "+lc);
			System.out.println("Total number of Words in the file are "+wc);
			System.out.println("Total number of Characters in the file are "+cc);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				reader.close();
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}