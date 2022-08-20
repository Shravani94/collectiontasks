package taskno10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Manager extends Employee{
	public void write() {
		try {
			File file=new File("E:\\JavaTraining\\employee.txt");
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			if(file.exists())
			{
				
				bw.write("emlopyee file is inheriited");
				bw.newLine();
				bw.write("Name:Shravani");
				bw.newLine();
				bw.write("employee no:1994");
				bw.newLine();
				bw.write("dept:developer");
				System.out.println("text added successfully");
				bw.flush();
				bw.close();
			
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
		finally {
			System.out.println("finally block is executed");
			
		}
		
		}
	public void read()
	{
		File file=new File("E:\\JavaTraining\\employee.txt");
		try {
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
			if(file.exists())
				
			{
				String s=br.readLine();
			        while(s!=null)
			        {
			        	System.out.println(s);
			        	s=br.readLine();
			        	
			        }
			        
			}
			else {
				System.out.println("file is not existed");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	public static void main(String [] args)
	{
		 Manager m1=new  Manager();
		 m1.create();
		 m1.write();
		 m1.read();
		
	}

}
