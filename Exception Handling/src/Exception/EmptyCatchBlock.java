package Exception;

public class EmptyCatchBlock {

	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		catch(Exception e)
		{
			System.out.println("We have empty catch block");
		}

	}

}
