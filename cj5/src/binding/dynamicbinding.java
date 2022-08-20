package binding;

public class dynamicbinding {
	public void walk()
	{
		System.out.println("walk for 5 minutes");
	}
	
	}
class latebinding extends dynamicbinding{
	public void walk()
	{
		System.out.println("walk more 10 minutes");
		
	}
	
}
class mainclass
{
	public static void main(String[] args)
	{
		dynamicbinding d1=new dynamicbinding();
		d1.walk();
		latebinding l1=new latebinding();
		l1.walk();
		
	
	}
	
	
}
