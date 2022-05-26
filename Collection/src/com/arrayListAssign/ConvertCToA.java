package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Arrays;
public class ConvertCToA {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		System.out.println(a1);
		
		
		Object[] arr=a1.toArray();
		System.out.println("Array is : "+Arrays.toString(arr));
		
		
		
		
		

	}

}
