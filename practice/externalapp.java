package practice;

import java.io.IOException;

class externalapp
{
	public static void main(String[] args)
	{
		try
		{
			Process p= Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		

}
