package accessmodifiers;

public class garbagecollector {
	public void show()
	{
		System.out.println("show method");
	}
	public static void main(String[] args)
	{
		garbagecollector g1=new garbagecollector();
		g1.show();
		g1=null;
		System.gc();
	}
		protected void finalize()
		{
			System.out.println("garbage colected");
		}
		
		
	}

                 
