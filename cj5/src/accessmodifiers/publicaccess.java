package accessmodifiers;

public class publicaccess {
	public void add()
	{
		System.out.println("add method can be imported becuase it is public");
		
	}
	private void sub()
	{
		System.out.println("sub method we can not imported because it is private");
		
	}
	protected void mul()
	{
		System.out.println("mul we can imported becuase it is protedce");
		
	}
	void div()
	{
		System.out.println("we imported because it is default");
	}
	public static void main(String[] args) {
		publicaccess pc=new publicaccess();
		pc.add();
		pc.sub();
		pc.mul();
		pc.div();
	}

}
