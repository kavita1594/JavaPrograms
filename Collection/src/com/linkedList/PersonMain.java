package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	int id;
	String name;
	float weight;
	
	Person(){}
	Person(int i,String n,float w)
	{
		id=i;
		name=n;
		weight=w;
	}
	public String toString()
	{
		return "[ Id : "+id+"  Weight : "+weight+" Name :"+name+"]\n"; 
	}
	public int compareTo(Person p)
	{
		if(this.weight<p.weight)
			return -1;
		else if(this.weight>p.weight)
			return 1;
		else
			return 0;
	}
	
}
public class PersonMain 
{
	public void createPersonList()
	{
		ArrayList<Person> al=new ArrayList<Person>();
		al.add(new Person(10,"Nilesh",30));
		al.add(new Person(65,"Shree",5));
		al.add(new Person(12,"Sachin",35));
		al.add(new Person(24,"Mahi",24));
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
