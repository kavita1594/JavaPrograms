package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;

class Person1 implements Comparable<Person1>
{
	int id;
	String name;
	float weight;
	private int age;
	
	Person1(){}
	Person1(int i,String n,float w)
	{
		id=i;
		name=n;
		weight=w;
	}
	public String toString()
	{
		return "[ Id : "+id+"  Weight : "+weight+" Name :"+name+"]\n"; 
	}
	public int compareTo(Person1 p)
	{
		if(this.age<p.age)
			return -1;
		else if(this.age==p.age)
			return p.name.compareTo(this.name);
		else
			return 0;
	}
	
}
public class PersonMainComparator
{
	public void createPersonList()
	{
		ArrayList<Person1> al=new ArrayList<Person1>();
		al.add(new Person1(10,"Nilesh",30));
		al.add(new Person1(65,"Shree",5));
		al.add(new Person1(12,"Sachin",35));
		al.add(new Person1(24,"Mahi",24));
		System.out.println(al);
		System.out.println("=====Ascending order Weight=======");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("======Descending order Weight======");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

	
	public static void main(String[] args) 
	{
		PersonMain o=new PersonMain();
		o.createPersonList();
		
		
	}

}

