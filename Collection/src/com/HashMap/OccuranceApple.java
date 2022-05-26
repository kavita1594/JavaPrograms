package com.HashMap;
import java.util.HashMap;

public class OccuranceApple 
{
	public static void main(String[] args) 
	{
		String str="Apple";
		HashMap<Character,Integer> h=new HashMap<>();
		for(int i=0;i<str.length();i++)	
		{
			int val=h.getOrDefault(str.charAt(i),0);
			h.put(str.charAt(i),val+1);
		}
		System.out.println(h);
	}
}	


