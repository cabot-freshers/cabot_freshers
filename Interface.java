import java.io.*;

interface Animal{
	void nooflegs();
	void colour();
}

class Dog implements Animal{
	public void nooflegs(){
		System.out.println("No. of Legs");
	}
	public void colour(){
		System.out.println("Colour");
	}
}

class Interface{
	public static void main(String args[]){
		Dog d = new Dog();
		d.nooflegs();
		d.colour();
	}
}
