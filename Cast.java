import java.io.*;

class Employee
{
	void Display()
	{
		System.out.println("In Employee.");
	}
}

class Manager extends Employee
{
	void Display()
	{
		System.out.println("In Manager.");
	}
}

class Cast
{

public static void main(String args[])
{
	Employee e = new Employee();
	e.Display();

	Employee e2 = new Manager();	//Upcasting
	e2.Display();

	Manager m = (Manager) e2;	//Downcasting
	m.Display();
	}
}

