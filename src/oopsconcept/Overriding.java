package oopsconcept;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		 car.applyBreak();
		TataCar car1 = new TataCar();
		 car1.applyBreak();

	}

}
class Car {
	void applyBreak() {
		System.out.println("Break Failed");
	}
}
class TataCar extends Car{
	void applyBreak() {
		System.out.println("Strong Breaking");
	}
}