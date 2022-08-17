package TaskNo17;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TenthMedalAnnouncement {
	public void creation()
	{
	HashMap<Integer,Integer>medal=new HashMap<Integer,Integer>();
		medal.put(100, 88);
		medal.put(101, 70);
		medal.put(102, 80);
		medal.put(103, 90);
		medal.put(104, 75);
		medal.put(105, 90);
		
		System.out.println("Based on thenth score medal distribution");
		for(Map.Entry entry:medal.entrySet())
		{
			Integer marks=(Integer)entry.getValue();
			
			if(marks>=90)
			{
				System.out.println(entry.getKey()+"  Got Gold medal");
			} 
			else if(marks>=80&&marks<=90)
			{
				System.out.println(entry.getKey()+" Got Silver medal");
			}
			else if(marks>=70&&marks<=80)
			{
				System.out.println(entry.getKey()+" Got Bronze medal" );
			}
			}
		}
}
