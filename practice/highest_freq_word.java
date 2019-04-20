package practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class highest_freq_word 
{
	public static void main (String[] args)
	{
		HashMap<String,Integer>wordcounter=new HashMap<String,Integer>();
		BufferedReader reader=null;
		
		try
		{
			reader=new BufferedReader(new FileReader(" "));
			String currentline=reader.readLine();
			while(currentline != null)
			{
				String[] words=currentline.toLowerCase().split("");
				for(String word: words)
				{
					if(wordcounter.containsKey(word))
					{
						wordcounter.put(word,wordcounter.get(word)+1 );
					}
					
					else
					{
						wordcounter.put(word, 1);
					}
				}
				
				currentline=reader.readLine();
			}
			
			String mostfrequentword=null;
			int count=0;
			Set<Entry<String,Integer>>entryset= wordcounter.entrySet();
			for(Entry<String,Integer>entry:entryset)
			{
				if(entry.getValue()>count)
				{
					mostfrequentword=entry.getKey();
					count=entry.getValue();
//					System.out.println("The most repeated word in input file is : "+mostfrequentword);
//		            System.out.println("Number Of Occurrences : "+count);
				}
			}
			 System.out.println("The most repeated word in input file is : "+mostfrequentword);
             
	            System.out.println("Number Of Occurrences : "+count);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}