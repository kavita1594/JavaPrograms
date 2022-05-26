package com.treeMap;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) 
	{
		TreeMap<String,Float> t=new TreeMap<>();
		t.put("KK",66.00f);
		t.put("DD",88.5f);
		t.ceilingEntry("kk");
		System.out.println(t);

	}

}
