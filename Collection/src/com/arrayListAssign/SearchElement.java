package com.arrayListAssign;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(20);
		a.add(12);
		a.add(11);
		a.add(50);
		a.add(56);
		System.out.println(a);
		if(a.contains(11))
			System.out.println("Found the element.");
		else
			System.out.println("Not found");

	}

}
