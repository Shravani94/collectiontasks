package taskno2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class NoneEditable {
	public void createFile()
	{
		File f1=new File("E:task.txt");
		try {
			
			if(f1.exists())
			{
				System.out.println("file created");
			}
			else {
				f1.createNewFile(); 
				System.out.println("file is creted successfully");
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void writeData()
	{
		try {
			File f1=new File("E:task.txt");
			FileWriter fw=new FileWriter(f1);
			BufferedWriter bw=new BufferedWriter(fw);
			if(f1.exists())
			{
				bw.write("employee Details");
				bw.newLine();
				bw.write("Employee Id :2004");
				bw.newLine();
				bw.write("Dept :Developement");
				bw.newLine();
				bw.write("Name :Nibba");
				bw.flush();
				bw.close();
			}
			else {
				System.out.println("file not available");
			}
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	

