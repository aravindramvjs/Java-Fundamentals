package day04.practice;


class Student{
	
/////////////////////	get and set name////////////////////////
	
	String name;
	
	public void setName(String nameargs) {
		name = nameargs;
	}
	
	public void getName() {
		System.out.println("You're name is " + name);
	}
	
////////////////////	get and set marks //////////////////////////////
	
	int marks;
	
	public void setmark(int markargs) {
		marks = markargs;
	}
	
	public void getmarks() {
		System.out.println("your marks is "+ marks);
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		
		Student Studentobj = new Student();
		
		Studentobj.setName("aravind");
		Studentobj.getName();
		
		Studentobj.setmark(90);
		Studentobj.getmarks();
		
	}
}
