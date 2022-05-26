package com.treeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
class sortKey implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s1.compareTo(s2);
	}
}
public class TreeMapInteger 

{

	public static void main(String[] args) 
	{
		//1
		TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
		t.put(11, 11);
		t.put(12, 12);
		t.put(13, null);
		System.out.println(t);
		//2
		TreeMap<String,String> t1=new TreeMap<String,String>();
		t1.put("ss","11");
		t1.put("kk", "ww");
		t1.put("ww", null);
		System.out.println(t1);
		TreeMap<Integer,String> t3=new TreeMap<Integer,String>();
		t3.put(1,"ss");
		t3.put(22, "ww");
		t3.put(3, null);
		System.out.println(t3);
		System.out.println(t3.get(2));
		System.out.println(t3.containsValue("ww"));
		//Key value
		Set<Integer> s=t3.keySet();
		for(Integer s1:s)
		{
			System.out.println(s1);
		}
		//delete all
		//t3.clear();
		System.out.println(t3);
		//add treemap in treemap
		TreeMap<Integer,String> t4=new TreeMap<Integer,String>();
		t4.put(4,"ss");
		t4.put(32, "ww");
		t4.put(31, null);
		t4.putAll(t3);;
		System.out.println(t4);
		
		

	}

}
