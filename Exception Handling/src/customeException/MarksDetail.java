package customeException;

public class MarksDetail
{
	public void acceptMarksDetails(int marks) 
	{
		if(marks>=1 && marks<=100)
			System.out.println("Marks are valid");
		else {
			try {
				throw new  InvalidMarksException();
			}
			catch(InvalidMarksException e)
			{
				e.show();
			}
		}
			
			
	}
	public static void main(String[] args) 
	{
		MarksDetail m=new MarksDetail();
		m.acceptMarksDetails(44);
		
		

	}

}
