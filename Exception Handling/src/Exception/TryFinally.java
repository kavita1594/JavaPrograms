package Exception;

public class TryFinally {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside try block");
			int a=10;
			int b=2;
			int c=a/b;
			System.out.println("C= "+c);
			
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finally block");
		}

	}

}
