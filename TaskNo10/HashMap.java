package TaskNo10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
	java.util.HashMap<Integer,Student> list=new java.util.HashMap<Integer,Student>();
	public void create() {
		Student sc1=new Student("Seetha",120,"cse","scit");
		Student sc2=new Student("Geetha",220,"ece","scei");
		Student sc3=new Student("Ramu",320,"eee","jits");
		Student sc4=new Student("Somu",420,"civil","vits");
		list.put(1,sc1);
		list.put(2, sc2);
		list.put(3, sc3);
		list.put(4, sc4);
		System.out.println("student details map");
		for(Map.Entry<Integer, Student>entry:list.entrySet())
		{
			System.out.println(entry);
			
		}
	}
	public void serialize()
	{
		try {
			FileOutputStream file=new FileOutputStream("E:\\JavaTraining\\HasH.txt");
			ObjectOutputStream obj=new ObjectOutputStream(file);
			obj.writeObject(list);
			obj.flush();
			obj.close();
			System.out.println("file created successfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void deserilize()
	{
		try {
			FileInputStream input=new FileInputStream("E:\\JavaTraining\\HasH.txt");
			ObjectInputStream obj=new ObjectInputStream(input);
			System.out.println();
			Object List2=obj.readObject();
			System.out.println(List2);
			obj.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
