package taskno2;
import java.io.File;

public class MakeReadOnly {
	public static void main(String[] args)
	{
		NoneEditable ne=new NoneEditable();
		ne.createFile();
		ne.writeData();
		MakeReadOnly mr=new MakeReadOnly();
		mr.makeReadOnly();
	}
	public void makeReadOnly() {
		try {
		File f1=new File("E:task.txt");
		if(f1.exists())
		{
			boolean str=f1.setReadOnly();
			if(!f1.canWrite())
			{
				System.out.println("this file is converted to Readable only file");
				
			}
			else {
				System.out.println("file not converted to readable");
			}
		}
		else {
			System.out.println("file not exists");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
