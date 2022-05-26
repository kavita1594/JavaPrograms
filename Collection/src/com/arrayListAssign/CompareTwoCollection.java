package com.arrayListAssign;

import java.util.ArrayList;

public class CompareTwoCollection 
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		System.out.println(a1);
		
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(11);
		a2.add(22);
		a2.add(34);
		System.out.println(a2);
		boolean b1=a1.equals(a2);
		System.out.println(b1);
		
		System.out.println(a1.isEmpty());
		System.out.println(a1);
	
		
		
		
	}

}
