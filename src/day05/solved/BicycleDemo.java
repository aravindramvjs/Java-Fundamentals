package day05.solved;

class Bicycle {

	int speed = 0;
	int gear = 1;

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println(" speed:" + speed + " gear:" + gear);
	}
}


public class BicycleDemo {

	public static void main(String[] args) {

				// Create two different
				// Bicycle objects
				Bicycle bike1 = new Bicycle();
				Bicycle bike2 = new Bicycle();

				// Invoke methods on
				// those objects
				bike1.speedUp(10);
				bike1.changeGear(2);
				bike1.printStates();

				bike2.speedUp(10);
				bike2.changeGear(2);
				bike2.speedUp(10);
				bike2.changeGear(3);
				bike2.printStates();

	}

}
