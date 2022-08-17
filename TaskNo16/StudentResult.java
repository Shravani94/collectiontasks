package TaskNo16;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentResult {
	HashMap<String,Float>result=new HashMap<String,Float>();
	public void create()
	{
		String name;
		float marks;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
		System.out.println("enter name:"+i);
		name=sc.next();
		System.out.println("enter rollno "+i);
		marks=sc.nextInt();
		result.put(name, marks);
		}
		
	}
	public void display()
	{
		System.out.println("Student Result");
		
		for (Map.Entry<String,Float> entry : result.entrySet()) { 
	        if(entry.getValue()>60)
	        {
	           System.out.println ( "Pass " + entry.getKey());
	}
	        else{
	        	System.out.println("Fail :"+entry.getKey());
	        }
		
	}
		}
}

