package Business_layer;
import Data_Layer.data;
public class add {
	data ab=new data();
	public int addition(int a,int b){
		int c=a+b;
		ab.daaa(a, b, c, "addition");
		return c;
	}
	public int substraction(int a,int b)
	{
		int c=a-b;
		ab.daaa(a, b, c, "substarction");
		return c;
	}
	public int multi(int a,int b){
		int c=a*b;
		ab.daaa(a, b, c, "multiply");
		return c;
	}
	public int division(int a,int b)
	{
		int c=a/b;
		ab.daaa(a, b, c, "division");
		return c;
	}

}
