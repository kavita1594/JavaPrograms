package com.arrayListAssign;

import java.util.ArrayList;

public class SizeOfElement {

	public static void main(String[] args) 
	{	
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(7);
		a.add(2);
		a.add(1);
		System.out.println("Elements are : "+a);
		System.out.println("Size is : "+a.size());
		
		//ArrayList is empty or not
		System.out.println(a.isEmpty());
		System.out.println(a);
		
		//empty array list
		
//		System.out.println("Removing all : "+a.removeAll(a));
//		System.out.println("String is empty: "+a);

	}

}
