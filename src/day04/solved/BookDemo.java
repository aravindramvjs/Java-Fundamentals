package day04.solved;

class Book {
	void display() {
		System.out.println("Display Method is invoked");
	}
}

class BookDemo {

	public static void main(String[] args) {
		
		Book newBook = new Book();
		System.out.println(newBook);
		newBook.display();

	}
}