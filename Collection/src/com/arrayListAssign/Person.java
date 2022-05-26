package com.arrayListAssign;

import java.util.ArrayList;

public class Person 
{
	int age;
	String name;
	public Person() 
	{
		
	}
	Person(int a,String n)
	{
		age=a;
		name=n;
	}
	public String toString()
	{
		return "["+name+","+age+"]";
		
	}
	
	
}
