package pkg1;

public class Constr 
{
public Constr() 
{
	this(1,2,4);
	System.out.println("Default constructor");
}
public Constr(int a) 
{
	this (1,2,3,4);
	System.out.println("one parameterized constructor");
}
public Constr(int a ,int b) 
{
	this();
	System.out.println("two parameterized constructor");
}
public Constr(int a, int b, int c) 
{
	System.out.println("three parametrized constructor");
}
public Constr(int a, int b, int c, int d) 
{
	this (1,2);
	System.out.println("four parameterized constructor");
}
public static void main(String[] args) {
	Constr abc =new Constr(12);
}
}
