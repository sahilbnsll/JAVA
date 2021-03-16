public class FirstException
{
	public static void main(String[] args)
	{
		try
		{
			int a=20/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}            
