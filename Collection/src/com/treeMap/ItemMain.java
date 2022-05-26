package com.treeMap;

import java.util.Set;
import java.util.TreeMap;

class Item implements Comparable<Item>
{
	int id;
	String name;
	float price;
	Item(){}
	Item(int i,String n,float p)
	{
		id=i;
		name=n;
		price=p;
	}
	public String toString()
	{
		return "[ ID = "+id+" , Name = "+name+" , Price ="+price+"]\n";
	}
	@Override
	public int compareTo(Item o) 
	{
		if(this.price<o.price)
			return -1;
		else if(this.price==o.price)
			return this.id-o.id;
		else
			return 1;
		
		
	}
	
}
public class ItemMain {

	public static void main(String[] args)
	{
		TreeMap<Item,String> t=new TreeMap<Item,String>();
		t.put(new Item(1,"Shree",89.00f), "AA");
		t.put(new Item(2,"Sachin",35.04f), "BB");
		t.put(new Item(3,"Amar",67.50f), "CC");
		Set<Item> KeySet=t.keySet();
		for(Item item:KeySet)
		{
			System.out.println(item);
		}
	}

}
