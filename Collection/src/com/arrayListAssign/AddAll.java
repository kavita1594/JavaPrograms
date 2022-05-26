package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Collections;

public class AddAll {

	public static void main(String[] args) 
	{
		ArrayList<String> box=new ArrayList<>();
		box.add("pen");
		box.add("Pencil");
		box.add("book");
		System.out.println(box);
		
		ArrayList<String> bags=new ArrayList<>();
		bags.add("Rubber");
		bags.add("Pencil");
		bags.add("book");
		System.out.println(bags);
		
		//addAll 
		box.addAll(bags);
		System.out.println(box);
		
		//sort
		Collections.sort(bags);
		System.out.println("After sorting is :"+bags);

	}

}
