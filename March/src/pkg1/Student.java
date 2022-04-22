package pkg1;

public class Student 
{
int roll_Number;
int age;

public void display1()
{
System.out.println("Welcome to all of you");	
}
public void display2()
{
System.out.println("Automation is easy");	
}
public static void main(String[] args) 

{
Student abc = new Student();
abc.age= 30;
abc.roll_Number=40;
System.out.println(abc.age);
System.out.println(abc.roll_Number);
abc.display1();
abc.display2();

}

}
