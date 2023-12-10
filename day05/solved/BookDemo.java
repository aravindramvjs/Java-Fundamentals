package day05.solved;

public class BookDemo {
	
	public void display() {
		System.out.println("Display Method is invoked");
	}

	public static void main(String[] args) {
		
		BookDemo newBook = new BookDemo();
		System.out.println(newBook);
		newBook.display();

	}
	
	

}
