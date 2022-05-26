package customeException;

public class ContactDetail
{
	public void acceptContactDetail(String mobile)
	{
		if(mobile.matches("[0-9]{10}"))
		System.out.println("Mobile no  is valid");
		else 
		{
			try
		{
				throw new InvalidContactException("Mobile no is not valid");
		}
			catch(InvalidContactException e)
			{
				e.show();
			}
		}
	}
	public static void main(String[] args)
	{
		ContactDetail c=new ContactDetail();
		c.acceptContactDetail("9552258133");

	}

}
