package TaskNo8;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCreation {
	TreeMap<Integer,String>map=new TreeMap<Integer,String>();
	public void create()
	{
		map.put(6, "Hitec");
		map.put(1, "Kukatpally");
		map.put(2, "HoushigBoard");
		map.put(3, "forum mal");
		map.put(4, "rayadurgum");
		map.put(5, "cybertower");
		System.out.println("List of areas: "+map);
		System.out.println();
	}
	public void iteration(){
		System.out.println("After iterarion entrySet :");
		for (Map.Entry<Integer,String> entry : map.entrySet()) { 
	        System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());
	}
		System.out.println();
}
	public void iteration2()
	{
		System.out.println("iteration with keyset");
		for(Integer Key:map.keySet())
		{
			System.out.println("Key's are "+Key);
		}
		System.out.println();
}
	public void iteration3()
	{
		System.out.println("After iteraion with value");
		for(String value:map.values())
		{
			System.out.println("Values :"+value);
		}
		System.out.println();
	}
	public void iteration4()
	{
		System.out.println("After iteration with iterator");
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator itr=set.iterator();
		 while(itr.hasNext()){  
		        
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		 }
		 System.out.println();
	}
}
