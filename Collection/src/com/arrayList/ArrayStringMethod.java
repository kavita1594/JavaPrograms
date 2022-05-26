package com.arrayList;

import java.util.ArrayList;

public class ArrayStringMethod 
{
	public static void show( ArrayList<String> a)
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).length()>5)
				System.out.println(a.get(i));
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<String> o=new ArrayList<>();
		o.add("Kia");
		o.add("Progamming");
		o.add("Java");
		o.add("System");
		ArrayStringMethod.show(o);
	}
}
