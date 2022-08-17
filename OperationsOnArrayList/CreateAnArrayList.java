package OperationsOnArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.ElementIterator;
public class CreateAnArrayList {
	ArrayList<String> list=new ArrayList<String>();
	public void creation()
	{
		list.add("Bag");
		list.add("flag");
		list.add("Mouse");
		list.add("kayboard");
		list.add("pen");
		list.add("flag");
		System.out.println(list);
		
	}
	public void literation()
	{
		System.out.println("After iteration");
		
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
	}
	public void add()
	{
		System.out.println("After adding elements in specific position");
		list.add(6, "System");
		list.add(7, "Flag");
		list.add(8, "pen");
		System.out.println(list);
		System.out.println();

	}
	public void reversOrder()
	{
		System.out.println("Array list in revers order");
		System.out.print("[");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+ " ,");
		}
		System.out.print("]");
		System.out.println();

	}
	public void insertionUsingListIterator()
	{System.out.println("After inserting with list iterator");
	
		ListIterator <String> list1= list.listIterator();
		list1.add("System");
		list1.add("coonection wires");
		System.out.println(list);
		System.out.println();

		
	}
	public void sorting()
	{
		System.out.println("After sorting method");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();

	}
	public void replace()
	{System.out.println("After replacing");
		list.set(2, "Monitor");
		list.set(6, "processor");
		System.out.println(list);
		System.out.println();

		
	}
	public void search()
	{
		System.out.println("searching an element from list");
		System.out.println("The searching element is found : "+list.contains("flag") );
		System.out.println();
	}
	public void removing()
	{
		System.out.println("After removing specific index element");
		list.remove(2);
		System.out.println(list);
		System.out.println();
		
		
	}
	public void removeDuplicate()
	{ArrayList<String>list2=new ArrayList<String>();
		System.out.println("After removing duplicate values");
		
		for(int i=0;i<list.size();i++)
		{
			int count=0;
			for(int j=0;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				list2.add(list.get(i));
			}
		}
		System.out.println(list2);
	}

}
