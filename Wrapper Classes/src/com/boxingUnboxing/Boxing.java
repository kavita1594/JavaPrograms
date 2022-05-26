package com.boxingUnboxing;

public class Boxing {
	
	public static void main(String[] args)
	{
		Integer i=100;
		int x=20;
		Integer i1=Integer.valueOf(x);
		System.out.println(x);
		
		x=i1.intValue();
		x=i1;
		System.out.println(x);
		
		String s="234";
		x=Integer.parseInt(s);
		System.out.println(x);
		
		Float f=20.0f;
		float y=10.00f;
		Float f1=Float.valueOf(y);
		System.out.println(y);
		y=f1;
		System.out.println(y);
		
	}

}
