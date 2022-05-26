package com.HashMap;
import java.util.HashMap;
import java.util.Iterator;
public class WithoutGenerics {

	public static void main(String[] args)
	{
		HashMap h=new HashMap();
		h.put("Shree", 1);
		h.put("Rushi", 2);
		h.put("Sachin", 3);
		System.out.println(h);
		HashMap h1=new HashMap();
		h1.put(4, "Shree");
		h1.put(5, "Amar");
		h1.put(6, "Kavi");
		System.out.println(h1);
		System.out.println("Size is = "+h.size());
		
		
	}

}
