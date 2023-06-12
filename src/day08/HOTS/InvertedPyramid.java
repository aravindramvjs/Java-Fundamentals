package day08.HOTS;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the height of the pyramid: ");
		int n = scan.nextInt();
		
		String a = " ";
		
		char symbol = '*';

		for(int i = n; i >= 1; i--) {
			
			
		    for (int space = 0; space <= n-i; space++){
		        a += " ";
		    }
		    for(int j=1; j<=(i*2)-1; j++){
		        a+=symbol;
		    }
		    a+="\n";
		}
		
		System.out.println(a);
		
		scan.close();

	}

}
