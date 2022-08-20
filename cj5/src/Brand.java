public class Brand implements car{
	public void speed()
	{
		System.out.println("car speed is 120 km/hr");
	}
	public void name()
	{
		System.out.println("the brand name is swift");
	}
	public void cost()
	{
		System.out.println("the cost is 12,00,000 rupees ");
	}
	public static void main(String[] agrs)
	{
		Brand b1=new Brand();
		b1.speed();
		b1.name();
		b1.cost();
	}
	
}
