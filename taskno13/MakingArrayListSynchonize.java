package taskno13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class MakingArrayListSynchonize {
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add("rama");
		list.add("sita");
		list.add('a');
		list.add(100);
		List list2=Collections.synchronizedList(list);
		Iterator itr=list2.iterator();
		while(itr.hasNext())
		{
			if(itr.next()=="rama")
			{
				try{
				list2.wait(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			}
			if(itr.next()=="sita")
			{
				list2.set(3, "radha");
			}
			System.out.println(list2);
		}
		
		
		
	}

}
