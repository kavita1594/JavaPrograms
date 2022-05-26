package com.arrayListAssign;

import java.util.ArrayList;

public class RetriveElementIndex {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(11);
		a.add(22);
		a.add(33);
		a.add(44);
		System.out.println(a);
		System.out.println("Retrive from index : "+a.get(3));
		
		//Insertion element
		a.add(0, 10);
		a.add(0, 12);
		System.out.println(a);
		
		

	}

}
