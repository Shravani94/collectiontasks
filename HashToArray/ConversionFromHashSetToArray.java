package HashToArray;
import java.util.HashSet;
import java.util.Arrays;

public class ConversionFromHashSetToArray {
	HashSet<String>electronicGadgets=new HashSet<String>();
	public void create() {
		electronicGadgets.add("Mobiles");
		electronicGadgets.add("Laptops");
		electronicGadgets.add("Ac's");
		electronicGadgets.add("Washing machines");
		electronicGadgets.add("refrigiretors");
		System.out.println("HasSet List : "+electronicGadgets);
	}
	public void convertToArray()
	{
	Object[] Arr=electronicGadgets.toArray();
	
	System.out.println("array is created");
	for(int i=0;i<Arr.length;i++)
	{
		System.out.print(Arr[i]+" ,");
	}
	
	}

}
