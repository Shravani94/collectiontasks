package TaskNo20;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StateAndCapital {
	HashMap<String,String>map=new HashMap<String,String>();
	
	
	public void createArrayForStates()
	{
      int size;
      Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		size=sc.nextInt();
		
	    String array[]=new String[size];
		String array1[]=new String[size];
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter state: "+i);
			array[i]=sc.next();
		}
		System.out.println("State array is created");

		for(int i=0;i<size;i++)
		{
			System.out.println("enter capital:"+i);
			array1[i]=sc.next();
			
		}
		System.out.println("capital array is created");
		for(int j=0;j<array.length;j++)
		{
			map.put(array[j], array1[j]);
		}
		System.out.println("hash map is created");
		for(Map.Entry ent:map.entrySet())
		{
			System.out.print(ent.getKey()+"||"+ent.getValue()+"-");
		}
		
	}
	
	
	

}
