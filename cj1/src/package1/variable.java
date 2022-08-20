package package1;

public class variable {
	public int a=10;//non static
	public static int b=20;//static
	public static void main(String [] args)
	{
		int c=30;//local
		variable v1=new variable();
		System.out.println(v1.a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
