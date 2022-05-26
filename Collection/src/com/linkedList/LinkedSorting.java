package com.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedSorting {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<>();
		l.add("java");
		l.add("Programmin");
		l.add("Python");
		l.add("C++");
		System.out.println(l);
		System.out.println("======Ascending order==========");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("======Descending order===========");
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
	}
}
