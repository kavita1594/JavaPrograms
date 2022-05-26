package com.arrayListAssign;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		System.out.println(a1);
		
		a1.set(2, 55);
		System.out.println(a1);

	}

}
