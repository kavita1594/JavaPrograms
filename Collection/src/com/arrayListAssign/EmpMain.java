package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) 
	{
		ArrayList< Employee > a1=new ArrayList< Employee >();
		a1.add(new Employee(1,"Abhay",12000));
		a1.add(new Employee(2,"shree",10000));
		a1.add(new Employee(3,"Sachin",3000));
		System.out.print(a1);
		System.out.println("==================");
		Employee.showSalary(a1);
		System.out.println("====================");
		Employee.showName(a1);
		System.out.println("=====================");
		Employee.showHeighestSalary(a1);

	}

}
