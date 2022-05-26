package com.arrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysString 
{
	
	public static void main(String[] args)
	{
		ArrayList<String> o=new ArrayList<>();
		o.add("Kia");
		o.add("Programing");
		o.add("java");
		o.add("system");
		
		for(int i=0;i<o.size();i++)
		{
			if(o.get(i).length() >5)
				System.out.println(o.get(i));
		}
		
	}

}
