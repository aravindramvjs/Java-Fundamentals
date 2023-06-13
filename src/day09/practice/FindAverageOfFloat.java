package day09.practice;

import java.util.*;

public class FindAverageOfFloat {

	static void FindAverage(float[] inputArray) {//method to find average

		float sum = 0; //avg = sum / n
		
		for(float element : inputArray) {//for used for sum all the elements in the array
			sum+=element;
		}
		
		float average = sum/inputArray.length;//avg = sum / n
		
		System.out.println("The Average of this array is "+ average);//print the average value
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter The length of the array: ");
		int len = scan.nextInt();
		
		float[] myarr = new float[len];
		
		for(int i = 0; i < len; i++) {
			
			System.out.printf("Enter no %d Float element of the array: ",i+1);
			float element = scan.nextFloat();
			
			myarr[i] = element;
		}
		
		FindAverage(myarr);//calling FindAverage method
		
	}

}
