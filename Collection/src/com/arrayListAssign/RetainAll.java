package com.arrayListAssign;

import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) 
	{
		ArrayList<String> box=new ArrayList<>();
		box.add("Pen");
		box.add("Pencil");
		box.add("Paper");
		System.out.println("Box contain : "+box);
		
		ArrayList<String> bags=new ArrayList<>();
		bags.add("Pen");
		bags.add("Pencil");
		bags.add("Rubber");
		bags.add("books");
		System.out.println("Bag contain : "+bags);
		
		System.out.println("======After retaining all==========");
		box.retainAll(bags);
		System.out.println("Box : "+box);
		System.out.println("Bgas : "+bags);
		
		//Two String is equal or not
		boolean value=box.equals(bags);
		System.out.println(value);
		
		//Join two array list
		
		System.out.println(box.addAll(bags));
		System.out.println(box);
		
		//clone arrayList
		System.out.println(box.clone());
	}

}
