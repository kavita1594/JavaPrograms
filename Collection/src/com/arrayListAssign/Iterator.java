package com.arrayListAssign;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList();
		a.add("Python");
		a.add("Java");
		a.add("Programming");
		System.out.println(a);
		System.out.println("After Iterator : ");
//		for(int i=0;i<a.size();i++)
//		{
//			System.out.print(a.get(i));
//			System.out.print(", ");
//		}
			
		for(String a1:a)
		{
			System.out.print(a1);
			System.out.print(", ");
		}
	}

}
