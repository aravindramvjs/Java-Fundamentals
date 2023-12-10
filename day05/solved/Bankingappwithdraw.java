package day05.solved;

class Account {
	String accno; // attribute | account number must be in string cuz acc no can start at 0
	double balance; //attribute | balance is double cuz balance can also return in point value
	
	public boolean withdraw(double amount) {
		balance -= amount;
		System.out.println("you're balance is ₹"+ balance);
		return true;
	}
}

public class Bankingappwithdraw {

	public static void main(String[] args) {
		
		Account useracc = new Account();
		
		useracc.accno = "1001 2548 8932 9821";
		useracc.balance = 10000;
		useracc.withdraw(2000);

	}

}
