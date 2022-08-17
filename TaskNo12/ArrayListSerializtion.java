package TaskNo12;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArrayListSerializtion {
	ArrayList<String>list=new ArrayList<String>();
	public void creation()
	{
		list.add("Believe");
		list.add("you");
		list.add("Do");
		list.add("Any");
		list.add("thing");
	}
	public void Serialize()
	{
		try {
		FileOutputStream filein=new FileOutputStream("E:\\JavaTraining\\linked.txt") ;
		ObjectOutputStream obj=new ObjectOutputStream(filein);
		obj.writeObject(list);
		obj.flush();
		System.out.println("file is created");
		obj.close();
		filein.close();
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("File is not create");
		}
		
	}
	

}
