package day12.practice;

import java.util.Scanner;

public class EmailValidator {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Email Address: ");
        
        String email = sc.nextLine();
        
        EmailValidationNewClass.Validation(email);
        
        sc.close();
    }
}

class EmailValidationNewClass {
	
    public static void Validation(String emailVali) {
    	
        int count = 0;
        
        for (int i = 0; i < emailVali.length(); i++) {
        	
            if (emailVali.charAt(i) == '@' || emailVali.charAt(i) == '.') {
                count++;
            }
        }
        
        if (count == 2) {
            System.out.println("Vaild Email Address");
        } else {
            System.out.println("Invaild Email Address");
        }
    }
}