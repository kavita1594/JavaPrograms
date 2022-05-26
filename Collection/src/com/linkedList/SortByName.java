package com.linkedList;

import java.util.Comparator;

public class SortByName implements Comparator<Person1>
{
	public int compare(Person1 o1, Person1 o2) 
	{
		
		return o1.name.compareTo(o2.name);
	}
}
class SortByWeightDesc implements Comparator<Person>
{
	public int compare(Person o1, Person o2) 
	{
		
		return (int) (o2.weight-o1.weight);
	}
	}