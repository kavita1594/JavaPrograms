package Exception;

import java.nio.channels.AlreadyBoundException;

public class Test2
{
	
	public static void main(String[] args)
	{
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("sum is="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		try
		{
			String arr[]= {"k","a","a"};
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(AlreadyBoundException e)
		{
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
