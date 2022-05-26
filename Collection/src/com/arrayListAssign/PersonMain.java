package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Iterator;
public class PersonMain 
{
	public static void show(ArrayList<Person> p)
	{
		for(int i=0;i<p.size();i++)
		{
			if(p.get(i).age>30)
				System.out.println("Age above 30 : "+p.get(i));
		
		}
	}
	public static void showmin(ArrayList<Person> p)
	{
		for(int i=0;i<p.size();i++)
		{
			if(p.get(i).age<=30)
			System.out.println("Age less than 30 : "+p.get(i));
		}
	}
	public static void showAvg(ArrayList<Person> p)
	{
		int sum=0;
		Iterator<Person> itr=p.iterator();
		while(itr.hasNext())
		{
			sum=sum+itr.next().age;
		}
		System.out.println("Average age is = "+(sum/p.size()));
		
		
	}
	
	private static Object p(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) 
	{
		ArrayList<Person> p1=new ArrayList<Person>();
		p1.add(new Person(20,"Nilesh"));
		p1.add(new Person(30,"Shree"));
		p1.add(new Person(45,"Sachin"));
		System.out.println(p1);
		show(p1);
		showmin(p1);
		showAvg(p1);
		
		
	}

}
