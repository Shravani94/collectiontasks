package ListSetMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;


public class ArrayList {
	public void List()
	{
		LinkedList<String> list1=new LinkedList<String>();
			list1.add("Hii");
			list1.add("Hello");
			list1.add("Welcome to");
			list1.add("Tech outs");		
	        list1 = (LinkedList<String>) Collections.unmodifiableList(list1);
	        try {
		list1.add("hii");
		System.out.println(list1);
	        }catch (Exception e) {
	        	System.out.println(e);
	        	System.out.println("it is converted to readable");
	        	System.out.println(list1);
	        	
	        }
		
	}
	public void set()
	{
		Set<Integer>list2=new HashSet<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(0);
        list2= Collections.unmodifiableSet(list2);
        try {
    		list2.add(40);
    		System.out.println(list2);
    	        }catch (Exception e) {
    	        	System.out.println(e);
    	        	System.out.println("it is converted to readable");
    	        	System.out.println(list2);
    	        	
    	        }
	}
	public void Map()
	{
 HashMap<Integer,String> map=new HashMap<Integer,String>(); 
 map.put(100,"ramu");
 map.put(101,"somu");
 map.put(102, "bheema");
 map= (HashMap<Integer, String>) Collections.unmodifiableMap(map);
 try {
		map.put(104,"omu");
		System.out.println(map);
	        }catch (Exception e) {
	        	System.out.println(e);
	        	System.out.println("it is converted to readable");
	        	System.out.println(map);
	        	
	        }
 


 

}

}