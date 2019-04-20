package practice2;
import java.text.SimpleDateFormat;
import java.util.*;

public class date_format 
{
	public static void main(String [] args)
	{
		Date today=new Date();
		System.out.println("Todays date is: "+today);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("Todays formated date is: "+sdf.format(today));
	}
}
