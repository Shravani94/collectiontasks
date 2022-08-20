package taskno10;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;


public class Employee {
	public void create() {
		try {
	File file=new File("E:\\JavaTraining\\employee.txt");
	
		file.createNewFile();
		System.out.println("file created successfuly");
	}catch(Exception e)
		{
		System.out.println("error occured");
		e.printStackTrace();
		
		}
	}
	public void write() {
		try {
			File file=new File("E:\\JavaTraining\\employee.txt");
			FileWriter fw=new FileWriter(file);
			if(file.exists())
			{
				
				fw.write("emlopyee file is created");
				System.out.println("text added successfully");
				fw.flush();
				fw.close();
			}
			else {
				file.createNewFile();
				fw.write("emlopyee file is created just now created");

	
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
	public void read()
	{
		File file=new File("E:\\JavaTraining\\employee.txt");
		try {
		FileReader fr=new FileReader(file);
		
			if(file.exists())
				
			{
				 char[] ch2 = new char[(int) (file.length())];
			        System.out.println(ch2.length);
			        fr.read(ch2);
			        for (char ch1 : ch2)
			        {
			            System.out.print(ch1);
			        }
				System.out.println(fr.getEncoding());
			}
			else {
				System.out.println("file is not existed");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}