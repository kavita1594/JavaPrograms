package Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) 
	{
		try 
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occure");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception occure");
		}
		catch(Exception e)
		{
			System.out.println("Exception occure");
		}
		System.out.println("out of code");
	}

}
