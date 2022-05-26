package customeException;

public class InvalidContactException extends Exception
{
	String err;
	InvalidContactException()
	{
		super();
		err="Invalid mobie no.";
	}
	InvalidContactException(String err)
	{
		this.err=err;
	}
	public void show()
	{
		System.out.println(err);
	}
}
