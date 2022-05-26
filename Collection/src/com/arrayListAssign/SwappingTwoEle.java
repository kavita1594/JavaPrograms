package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingTwoEle {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		System.out.println(a1);
		Collections.swap(a1, 1, 2);
		System.out.println("After Swapping : "+a1);

	}

}
