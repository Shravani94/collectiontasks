 class MethodOverLoading {
	public void print()
	{
		System.out.println("no argument passed");
	}
	public void print(String name) {
		System.out.println("name is "+name);
	}
	public void print(long mobile) {
		System.out.println("mobile number is "+mobile);
	}

}
class mainclass
{
	public static void main(String[] agrs)
	{
		MethodOverLoading ml=new MethodOverLoading();
		ml.print();
		ml.print("dingi");
		ml.print(1234567890);
	}
}
