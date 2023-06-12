package day08.solved;

class Rat{
	
	int roomInBelly;
	
	void eatcheese(int bitesofcheese) {
		while (bitesofcheese > 0 && roomInBelly > 0) {
			bitesofcheese--;
			roomInBelly--;
		}
		System.out.println(bitesofcheese  + " pieces of cheese left");
		
	}
	
	void displayRoomInBelly() {
		System.out.println("Room in belly: " + roomInBelly);
	}
}

public class RatEats {

	public static void main(String[] args) {
		
		Rat mymouse = new Rat();
		
		mymouse.roomInBelly = 10;
		mymouse.eatcheese(9);
		mymouse.displayRoomInBelly();


	}

}
