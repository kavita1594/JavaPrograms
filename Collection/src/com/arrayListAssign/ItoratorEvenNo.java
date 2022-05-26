package com.arrayListAssign;

import java.util.ArrayList;
import java.util.Iterator;
public class ItoratorEvenNo
{
	public static void Iteratorshow(ArrayList<Integer> a)
	{
		System.out.println("Even no b/w 0 to 50 are: ");
		Iterator<Integer> itr=a.iterator();
		int n=0;
		while(itr.hasNext())
		{
			n=itr.next();
			if(n%2==0)
				System.out.println(n+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<>();
		for(int i=0;i<50;i++)
		{
			a1.add(i);
		}
		Iteratorshow(a1);
		

	}

}
