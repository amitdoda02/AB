package pkg1;

public class Arithmatic_1 
{
	public int sum(int a, int b) 
	{
	    int c;
	    c=a+b;
	    System.out.println("sum result is " +c);
		return c;	
	}
	public int sub(int x, int y) 
	{
		int z; 
		z=x-y;
		System.out.println("sub result is " +z);
		return z;
	}
	public int multi(int c, int d) 
	{
	int h;
	h=c*d;
	System.out.println("multi result is " +h);
	return h;

	}
	public void div(int c, int d) 
	{
	int h;
	h=c/d;
	System.out.println("Final result is " +h);

	}
	public static void main(String[] args) 
	{
	Arithmatic_1 abc = new Arithmatic_1();
	int mulResult = abc.multi(10, 2);
	int sumResult = abc.sum(mulResult,2);
	int subResult =abc.sub(sumResult, 2);
	int  subResult1 =abc.sub(subResult, 2);
	int sumResult1 =abc.sum(subResult1, 2);
	abc.div(subResult1, 2);

	}
}
