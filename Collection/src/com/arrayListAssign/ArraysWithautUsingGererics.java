package com.arrayListAssign;

import java.util.ArrayList;

public class ArraysWithautUsingGererics {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add("Car");
		a1.add(20.00);
		a1.add('A');
		System.out.println(a1);
		ArrayList<String> a2=new ArrayList<>();
		a2.add("Java");
		a2.add("Programming");
		System.out.println(a2);

	}

}
