package com.arrayListAssign;

import java.util.ArrayList;

public class CopyArrayListToAnother {

	public static void main(String[] args) 
	{
		ArrayList<String> box=new ArrayList<>();
		box.add("pen");
		box.add("Pencil");
		box.add("book");
		System.out.println("Befor copy = "+box);
		
		ArrayList<String> box1=box;
		System.out.println("After copy = "+box1);
		
		for(String b:box1)
		{
			System.out.println(b);
		}
		box1.set(1, "Bottle");
		System.out.println("Show = "+box1);

	}

}
