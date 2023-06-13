package day09.practice;

public class FindingAverage {

	static void FindAverage(int[] inputArray) {//method to find average

		int sum = 0; //avg = sum / n
		
		for(int element : inputArray) {//for used for sum all the elements in the array
			sum+=element;
		}
		
		int average = sum/inputArray.length;//avg = sum / n
		
		System.out.println("The Average of this array is "+ average);//print the average value
	}

	
	public static void main(String[] args) {
		
		
		int[] myarr = {1,2,3,4,5,6,8,9,11,221,33};//giving values to array inputArray
		
		FindAverage(myarr);//calling FindAverage method
		
	}
	
}
