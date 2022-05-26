package com.HashMap;
class Person
{
	int age;
	String name;
	Person(){}
	Person(int a,String n)
	{
		age=a;
		name=n;
	}
	public String toString()
	{
		return "[Name ="+name+" , Age = "+age+"]\n";
	}
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		if(this==o)
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		Person p=(Person) o;
		if(this.age==p.age && this.name.equals(p.name))
			return true;
		else
			return false;
		
		
	}
	public int hashCode()
	{
		int ans;
		ans=age*12+name.hashCode();
		return ans;
	}
}
public class HashMap {

	public static void main(String[] args)
	{
		Person p=new Person(22,"x");
		Person p1=new Person(22,"x");
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p.equals(p1));
		
		

	}

}
