package Exception;

import java.util.Scanner;

public class Test
{
	public void show(int a[],int n)
	{
		try
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];	
			}
			int avg=sum/n;
			
			System.out.println("sum is "+avg);
			Scanner sc=new Scanner(System.in);
			int element=sc.nextInt();
			System.out.println("Elements in the give index="+arr[element]);
		}
		catch(NullPointerException e)
		{
			
			System.out.println("execute sucessfully");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,5,1,6,9,6};
		int n=arr.length;
		Test t=new Test();
		t.show(arr, n);
	}

}
