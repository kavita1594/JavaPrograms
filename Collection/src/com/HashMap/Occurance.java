package com.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class Occurance {

	public static void main(String[] args)
	{
		
	
		ArrayList<String> a=new ArrayList<String>();
		a.add("Pune");
		a.add("Mumbai");
		a.add("Nashik");
		a.add("Pune");
		a.add("Nashik");
		System.out.println(a);
		HashMap<String,Integer> m=new HashMap<String ,Integer>();
		System.out.println(m);
		for(String city:a)
		{
			int val=m.getOrDefault(city, 0);
			m.put(city, val+1);
		}
		
		System.out.println(m);

	}

}
