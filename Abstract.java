import java.io.*;

abstract class Employee
{
	abstract void Display();
}

class Manager extends Employee
{
	void Display()
	{
		System.out.println("In Manager");
	}
}

class Clerk extends Employee
{
	void Display()
	{
		System.out.println("In Clerk");
	}

}
class Abstract
{
	static public void main(String args[])
	{
		Employee e = new Manager();
		e.Display();

		Employee e2 = new Clerk();
		e2.Display();

		//Employee e3 = new Employee();
	}
}
