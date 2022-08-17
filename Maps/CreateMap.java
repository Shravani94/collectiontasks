package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public  class CreateMap {
	

	HashMap<String,String> countries=new HashMap<String,String>();
	
void country() {
	/*countries.put("India","Delhi");
	countries.put("Chaina","Beijing");
	countries.put("America","Washington");
	countries.put("Rashya","MosCow");*/
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many countries you want");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		System.out.println("enter country : ");
		String s=sc.next();
		System.out.println("enter captal ");
		String t= sc.next();
		countries.put(s, t);
		
		
		
	}
	
}
public void entrySetWithiterator()
{
	Set set=countries.entrySet();
	Iterator itr=set.iterator();
	System.out.println("entrySetWithiterator output");
	System.out.println("---------------------------");
	 while(itr.hasNext()){  
	        
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	 }
	 System.out.println();
}
public void entrySetWithForEach()
{
	System.out.println("entrySetWithiterator output");
	System.out.println("---------------------------");
	for (Map.Entry<String,String> entry : countries.entrySet()) { 
        System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
	 }
	System.out.println();
}
public void iterateUsingKeySetAndForeach() {
	System.out.println("iterateUsingKeySetAndForeach output");
	System.out.println("----------------------------------");
    for (String key : countries.keySet()) {
        System.out.println(key + ":" + countries.get(key));
    }
    System.out.println();
}
public void iterateValuesByForEach() {
	System.out.println("iterateValuesByForEach output");
	System.out.println("------------------------------");
    for (String value : countries.values()) {
        System.out.println(value);
    }
    System.out.println();
}
	
	
}
