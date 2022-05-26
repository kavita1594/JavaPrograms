package com.HashMap;
import java.util.Collection;
import java.util.HashMap;
public class BJ
{
	
public static void main(String[] args)
{
	HashMap<String,String> h=new HashMap<>();
	h.put("X", "BJP");
	h.put("Y", "Congress");
	h.put("Z", "NCP");
	h.put("K", "BJP");
	h.put("S", "BJP");
	System.out.println(h);
	Collection<String> parties=h.values();
	HashMap<String,Integer> map=new HashMap<String,Integer>();
	
	for(String party:parties)
	{
		int val=map.getOrDefault(party, 0);
		map.put(party, val+1);
	}
	System.out.println(map);

}
}
