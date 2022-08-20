package binding;

public class staticbinding {
	public static void run(int a)
	{
		System.out.println("run "+a+" kilometers");
		
	}
	public static void run(double a)
	{
		System.out.println("wait for "+a+" meters after running");
	}
	public static void run(int a,int b)
	{
		System.out.println("paly "+a+" meters first then run"+b+" meters");
	}
	public static void main(String[] agrs)
	{
		System.out.println("main start");
		run(10);
		run(15.5);
		run(20,30);
	}
	
	

}
