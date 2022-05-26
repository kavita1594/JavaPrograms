package com.treeMap;

import java.util.Set;
import java.util.TreeMap;

class Student implements Comparable<Student>
{
	int roll;
	String name;
	int marks;
	Student(){}
	Student(int r,String n,int m)
	{
		roll=r;
		name=n;
		marks=m;
		
	}
	public String toString()
	{
		return "[ name= "+name+"roll no ="+roll+"  marks"+marks+"]\n";
	}
	public int compareTo(Student s)
	{
		if(s.marks<this.marks)
			return -1;
		else if(s.marks==this.marks)
		{
			int c=this.name.compareTo(s.name);
			return (c==0)? this.roll-s.roll:c;
			
		}
		else
			return 1;
	}
	
}
class Teacher
{
	String name;

	Teacher(String n)
	{
		name=n;
	}
}
public class StudentMain {

	public static void main(String[] args) 
	{
		TreeMap<Student,Teacher> t=new TreeMap<Student,Teacher>();
		t.put(new Student(11,"Shree",43), new Teacher("KK"));
		t.put(new Student(12,"Sachin",45), new Teacher("ss"));
		t.put(new Student(14,"Rushi",76), new Teacher("rr"));
		
		Set<Student> s=t.keySet();
		for(Student s1:s)
		{
			System.out.println(s1);
		}
		
		

	}

}
