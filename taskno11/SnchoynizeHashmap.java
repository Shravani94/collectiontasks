package taskno11;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SnchoynizeHashmap {
	public static void main(String[] args)
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		Map m1=Collections.synchronizedMap(map);
		map.put(100,"Nibba");
		map.put(101, "Nibbib");
		map.put(102, "Dinga");
		System.out.println(map);
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> map2=(Entry<Integer, String>) itr.next();
			if(map2.getKey().equals(100));
			{try {
				map2.wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			if(map2.getKey().equals(101));
			{
				try {
				map2.wait(1000);
			}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			System.out.println(map2.getKey()+"------>"+map2.getValue());
			
		}
		
		
	}

}
}
