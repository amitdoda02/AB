package pkg1;

public class Stdnt 
{
int a;
int b;

public void method1()
{
System.out.println("Method 1");	
}
public void method2()
{
	this.method1();
System.out.println("Method 2");	
}
public Stdnt() 
{
    this(12);
	System.out.println("Default constructor");	
}
public Stdnt(int a) 
{
System.out.println("one parametrized constructor");	
}
public static void main(String[] args)
{
	Stdnt abc =new Stdnt();
	abc.a=12;
	abc.b=13;
	System.out.println(abc.a);
	System.out.println(abc.b);
	abc.method2();
	
}




}
