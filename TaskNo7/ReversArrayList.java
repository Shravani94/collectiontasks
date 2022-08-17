package TaskNo7;
import java.util.ArrayList;
import java.util.Collections;

public class ReversArrayList {
	ArrayList<String>States=new ArrayList<String>();
	public void creat()
	{
		States.add("Telangana");
		States.add("Andra pradesh");
		States.add("Karnataka");
		States.add("Keral");
		States.add("Tamilanadu");
		States.add("mharastra");
		States.add("Orissa");
		System.out.println(States);
		System.out.println();
		
	}
	public void reverse()
	{
		System.out.println("Using revers method");
		Collections.reverse(States);
		System.out.println();
		System.out.println("By using loop");
		ArrayList<String>StatesReverse=new ArrayList<String>();
		for(String elemnet:States)
		{
			StatesReverse.add(elemnet);
		}
		System.out.println(StatesReverse);
		
	}

}
