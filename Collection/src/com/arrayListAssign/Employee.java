package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee 
{
	int id;
	String name;
	int sal;
	Employee()
	{
		
	}
	Employee(int i,String n,int s)
	{
		id=i;
		name=n;
		sal=s;	
	}
	public String toString()
	{
		return "Id ="+id+", Name is = "+name+", Salary is = "+sal+"\n";
	}
	
	public static void showSalary(ArrayList<Employee> s)
	{
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).sal>10000)
				System.out.println("Gretter salary"+s.get(i));
		
		}
		
	}
	public static void showName(ArrayList<Employee> n)
	{
		for(int i=0;i<n.size();i++)
		{
			if("Sachin".equals(n.get(i).name))
				System.out.println("Name is = "+n.get(i));
				
		}
	}
	public static void showHeighestSalary(ArrayList<Employee> a)
	{
		int max=0;
		Iterator<Employee> i = a.iterator();
		int maxsalary=0;
		int sal = 0;
		while(i.hasNext()){
		Employee e = i.next();
		sal = e.sal;
		if(sal > maxsalary){
		maxsalary= sal;
		}
		}
		System.out.println("maximum salary..."+maxsalary);
		}
		
	}


