package pkg1;

public class Git 
{
public void m1()
{
System.out.println("Default method");	
}
public void m1(int a)
{
System.out.println("one parameterized method");	
}
public void m1(int a , int b)
{
System.out.println("two parameterized method");	
}
public void m1(int a , int b, int c)
{
System.out.println("Three parameterized method");
this.m1();
this.m1(10);
this.m1(11, 12);
this.m1(13, 14, 15, 16);
}
public void m1(int a , int b, int c, int d)
{
System.out.println("Four parameterized method");	
}
public static void main(String[] args) 
{
Git ab = new Git();
ab.m1(10, 11, 12);
}
}
