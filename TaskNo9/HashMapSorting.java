package TaskNo9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapSorting {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	public void createMap()
	{
		System.out.println("list of corejava concepts ");
		System.out.println("--------------------------");
		map.put(6, "Java standards");
		map.put(2, "OOPs");
		map.put(3, "Exception");
		map.put(4, "Collections");
		map.put(1, "Threads");
		map.put(5, "Files");
		System.out.println(map);
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.putAll(map);
		//List<Entry<Integer,String>> list=new ArrayList<>(map.entrySet());
		
		//Collections.sort(list);
		for(Entry<Integer, String> s:tm.entrySet()) {
			System.out.println(s.getKey()+"  "+s.getValue());
		}
		System.out.println("By usingiterator ");
		Set set = map.entrySet();  
		java.util.Iterator iterator = set.iterator();  
		while(iterator.hasNext())   
		{  
		Map.Entry map1 = (Map.Entry<Integer,String>)iterator.next();  
		System.out.println(  map1.getKey()+"     "+map1.getValue());  
		}  
		
		
		}
}
//	}
//	public void sorting()
//	{
//		System.out.println("After sorting");
//		System.out.println("--------------------------");
//		 
//		
//		
//	
//
//}
