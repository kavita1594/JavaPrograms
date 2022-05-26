package com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash
{
	public void nevigate(HashMap<String,Integer> map)
	{
		System.out.println("All names(Keys) are");
		Set<String> keyset=map.keySet();
		Iterator<String> itr=keyset.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();
			System.out.println(name);
		}
		System.out.println("All no are : ");
		Collection<Integer> val=map.values();
		Iterator<Integer> itr1=val.iterator();
		while(itr1.hasNext())
		{
			Integer i=itr1.next();
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		HashMap<String,Integer> map=new HashMap<>();
		HashMap hash=new HashMap();
		
		
	}

}
