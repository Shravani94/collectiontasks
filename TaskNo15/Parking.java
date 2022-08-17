package TaskNo15;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Parking {
	public void create()
	{
	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<Integer> a2=new ArrayList<Integer>();
	HashMap<Integer,String>bike=new HashMap<Integer,String>();
	for(int i=1;i<=15;i++)
	{
		bike.put(i," b1");
	}
	HashMap<Integer,String>car=new HashMap<Integer,String>();	
	for(int j=1;j<=15;j++)
	{
		car.put(j, "b2");
	}
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("enter 1 for bikes;enter 2 for cars");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("enter your bike number");
		int num=sc.nextInt();
		if(a1.contains(num))
		{
			System.out.println("this vechicle slot is alredy alloctaed");
			
		}
		else
		{
			a1.add(num);
			System.out.println("Available slots are");
			for(Map.Entry enter:bike.entrySet())
			{
			System.out.println(enter.getKey());
			}
			System.out.println("enter slot number");
			int m=sc.nextInt();
			if(bike.containsKey(m))
			{
				System.out.println("your slot is allocted");
				bike.remove(m);
			}
			else
			{
				System.out.println("this slot is already allocated");
			}
			
			
		}
		break;
		case 2:System.out.println("enter your car number");
		int num1=sc.nextInt();
		if(a2.contains(num1))
		{
			System.out.println("this vechicle slot is alredy alloctaed");
			
		}
		else
		{
			a2.add(num1);
			System.out.println("Available slots are");
			for(Map.Entry enter:car.entrySet())
			{
			System.out.println(enter.getKey());
			}
			System.out.println("enter slot number");
			int m=sc.nextInt();
			if(car.containsKey(m))
			{
				System.out.println("your slot is allocted");
				bike.remove(m);
			}
			else
			{
				System.out.println("this slot is already allocated");
			}
			
			
		}
		break;
		default:System.out.println("please enter valid number");
		}
	}
	}
}
		
	
	
	
