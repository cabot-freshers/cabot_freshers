import java.io.*;

class Car{
	int noOfWheels = 4;
	void displayWheels(){
		System.out.println("Number of wheels: "+noOfWheels);
	}
}

class Honda extends Car{
	String brandName = "Honda";
	void displayBrand(){
		System.out.println("Car Make: "+brandName);
	}
}

class Amaze extends Honda{
	int topSpeed = 150;
	void displaySpeed(){
		System.out.println("Top Speed: "+topSpeed);
	}
}

class MultiLevelInheritance_2{
	public static void main(String args[]){
		Amaze a = new Amaze();
		a.displayWheels();
		a.displayBrand();
		a.displaySpeed();
	}
}
