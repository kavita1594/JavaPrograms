package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IntegerArray {

		public void iterator11()
		{
			ArrayList<Integer> a=new ArrayList<>();
			a.add(12);
			a.add(11);
			a.add(20);
			a.add(22);
	
			Iterator<Integer> i= a.iterator();	
			while(i.hasNext())
			{
				Integer num=i.next();
				System.out.println("Num is="+num);
			}
			
//			while(i.hasNext())
//			{
//				Integer num=i.next();
//				if(num.equals(20))
//				{
//					i.remove();
//				}
//				System.out.println("Num is = "+num);
//			}
//			System.out.println(a);
//			
			
			
			//Reverse Iterator
			ListIterator<Integer> litr =a.listIterator(a.size());
			while(litr.hasPrevious())
			{
				Integer o=litr.previous();
				System.out.println("Reverse num is : "+o);
			}
			
			
		}
	public static void main(String[] args) 
	{
		IntegerArray itr=new IntegerArray();
		itr.iterator11();
		
		

	}

}
