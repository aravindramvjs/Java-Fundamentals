package day05.practice;

class AccountDetails {
	
	String accno; // attribute | account number must be in string cuz acc no can start at 0
	double balance; //attribute | balance is double cuz balance can also return in point value
	double withdrawlAmount;
	
	boolean withdraw(double amount) {
		withdrawlAmount = amount;
		balance -= amount;
		return true;
	}
	
	void accountdetails() {
		System.out.printf("You've withdrawn Rs. %.2f On HDFC Bank Of Account Number %s On 2023-06-07 At 20:00:00. \nNow You're Avl Bal: Rs: %f.",withdrawlAmount,accno, balance);
	}
	
	
	
	
}



public class Bankappprintdetails {

	public static void main(String[] args) {
		AccountDetails useracc = new AccountDetails();
		
		useracc.accno = "1001 1254 0984 8922";
		useracc.balance = 10000;
		
		useracc.withdraw(1000);
		useracc.accountdetails();
		
		
	}

}
