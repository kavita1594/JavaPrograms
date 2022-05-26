package customeException;

public class InvalidMarksException extends Exception 
{
	int marks;
	InvalidMarksException()
	{
		marks=12;
	}
	InvalidMarksException(int m)
	{
		marks=m;
	}
	public void show()
	{
		System.out.println(marks);
	}
}
