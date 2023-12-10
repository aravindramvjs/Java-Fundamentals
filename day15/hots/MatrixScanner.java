package day15.hots;

import java.util.Scanner;

public class MatrixScanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.print("Enter the dimensions(N) for the matrix: ");
			int N = scan.nextInt();
			
			int[][] matrix = new int[N][N];
			
			 System.out.print("Enter the elements of the matrix:");
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					matrix[i][j] = scan.nextInt();
				}
			}
			
			System.out.print("Enter a number to add each element: ");
			int sum = scan.nextInt();
			
			System.out.printf("The Final %d X %d Matrix is\n", N, N);
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + sum + " ");
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}
		
		scan.close();
	}

}
