package practice;

public class replacingspaces 
{
	public static void main(String[] args)
	{
		System.out.println("Replaced string"+ replacingspaces.replacement("I am Shreyas. "));
	}
	
	public static String replacement(String str)
	{
		return str.replace(" ", "%20");
	}
}
