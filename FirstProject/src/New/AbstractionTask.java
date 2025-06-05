package Tests;

abstract class car{
	abstract void car_details();
	abstract void drive();
	
	
}

class car_features extends car{
	
	void car_details() {
		System.out.println("Car is in red color with 5 Seats and four doors");
		System.out.println("The car is ");
	}
	
	void drive() {
		System.out.println("The car is ready to drive");
	}
	
}

public class AbstractionTask{
	public static void main(String[] args) {
		
		car_features cf = new car_features();
		
		cf.car_details();
		cf.drive();
		
		
		
	}

}
