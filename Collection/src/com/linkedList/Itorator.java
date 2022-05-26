package com.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;
public class Itorator {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("java");
		l.add("Programmin");
		l.add("Python");
		l.add("C++");
		System.out.println(l);
		Iterator<String> itr= l.listIterator(1);
		System.out.println("======descending odring======");
		Iterator<String> itr1= l.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("===Inserting Element=====");
		l.add(1, "Dot Net");
		System.out.println(l);
		System.out.println("======Add first and add Last==========");
		l.addFirst("C#");
		l.addLast("Ruby");
		System.out.println(l);
		System.out.println("=====Front of the linked list========");
		l.offerFirst("SS");
		l.offerLast("Python");
		System.out.println(l);
		System.out.println("===First and last occurance========");
		Object o=l.getFirst();
		System.out.println("First elemen is= "+o);
		Object o1=l.getLast();
		System.out.println("Last Element is ="+o1);
		System.out.println("====show element in index wise========");
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Index is : "+i+" Element is : "+l.get(i));
		}
		System.out.println("======Remove element========");
		l.remove("Python");
		System.out.println(l);
		System.out.println("======Remove first and last========");
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println("========Remove all========");
		//l.removeAll(l);
		//System.out.println(l);
		System.out.println("======swap element======");
		Collections.swap(l, 1, 4);
		System.out.println(l);
	}

}
