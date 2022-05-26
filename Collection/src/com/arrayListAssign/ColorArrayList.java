package com.arrayListAssign;

import java.util.ArrayList;

public class ColorArrayList 
{
	
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("Red");
		a.add("Orange");
		a.add("Blue");
		a.add("Black");
		a.add("Pink");
		System.out.println(a);
		
		//revome elements
		
		System.out.println(a.remove(1));
		System.out.println(a);
		
		//remove All
		System.out.println(a.removeAll(a));
		System.out.println(a);
		
	}
	

}
