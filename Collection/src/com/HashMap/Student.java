package com.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
class Student1
{
	int roll;
	String name;
	int marks;
	Student1(){}
	Student1(int r,String n,int m)
	{
		roll=r;
		name=n;
		marks=m;
	}
	public String toString()
	{
		return "[Roll no ="+roll+" , Name ="+name+" , Marks ="+marks+"]    \n";
	}
	public boolean equals(Object o)
	{
		if(o==null)
		return false;
		if(this==o)
			return true;
		if(this.getClass()!=o.getClass())
			return false;
		Student1 s=(Student1)o;
		if(this.roll==s.roll && this.name.equals(s.name) && this.marks==s.marks)
			return true;
		else
			return false;
		
	}
	public int hashCode()
	{
		int ans;
		ans=roll+marks+name.hashCode();
		return ans;
		}
}
public class Student {

	public static void main(String[] args) 
	{
		ArrayList<Student1> a=new ArrayList<Student1>();
		a.add(new Student1(10,"Shree",65));
		a.add(new Student1(12,"Sachin",55));
		a.add(new Student1(15,"Rushi",87));
		a.add(new Student1(17,"Amar",96));
		a.add(new Student1(10,"Shree",65));
		a.add(new Student1(12,"Sachin",55));
		System.out.println(a);
		HashMap<Student1,Integer> m=new HashMap<Student1,Integer>();
		System.out.println(m);
		for(Student1 s:a)
		{
			int val=m.getOrDefault(s,0);
			m.put(s, val+1);
		}
		System.out.println(m);
		
	}

}
