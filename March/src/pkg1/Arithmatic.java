package pkg1;

public class Arithmatic 

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
System.out.println("Multi result is " +h);
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
Arithmatic abc = new Arithmatic();
int sumResult =abc.sum(10, 2);
int subResult =abc.sub(sumResult, 2);
int sumResult1 =abc.sum(subResult, 2);
int multiResult =abc.multi(sumResult1, 2);
abc.div(multiResult, 2);

}

}

