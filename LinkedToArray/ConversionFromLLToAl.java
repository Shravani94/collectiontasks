package LinkedToArray;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;


public class ConversionFromLLToAl {
	LinkedList<String>ll=new LinkedList<String>();
	public void create(){
		ll.add("Book");
		ll.add("pen");
		ll.add("pencile");
		ll.add("Paper");
		System.out.println("LinkedList objects :"+ll);
	}
	public void convert()
	{
		ArrayList<String>Al=new ArrayList<String>(ll);
		System.out.println("ArrayList Objects : "+Al);
	}
	

}
