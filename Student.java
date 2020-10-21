import java.util.*;
public class Student
{
	public static void main(String[] args)
	{
		System.out.println("Enter roll number: ");
		System.out.println("Enter age: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int age=s.nextInt();
		System.out.println("Student's roll number is "+n+" and age is: "+age);
	}
}
