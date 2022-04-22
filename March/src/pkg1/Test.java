package pkg1;

import java.util.Scanner;

public class Test 
{
public static void main(String[] args) 
{
int age;
System.out.println("Enter age of customer: ");
Scanner abc =new Scanner(System.in);
age=abc.nextInt();

if (age>=23)
{
	System.out.println("correct");
}
else
{
System.out.println("Wrong password");	
}
}
}
