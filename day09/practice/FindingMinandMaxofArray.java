package day09.practice;

//Write a Java program that takes an array of integers as input and finds the maximum and minimum values in the array. 
//Print both the maximum and minimum values.


public class FindingMinandMaxofArray {
	
		static void FindMin(int[] inputArray) {//method to find smallest number in array

			
			int min = inputArray[0];//to store temp min value
			
			for(int element : inputArray) {//for used to find min elements in the array
				if(element < min) {
					min = element;
				}
			}
			
			
			System.out.println("The Smallest Number is "+ min);//print the min value
			
		}
		
		static void FindMax(int[] inputArray) {//method to find largest number in array

			
			int max = inputArray[0];//to store temp max value
			
			for(int element : inputArray) {//for used to find max elements in the array
				if(element > max) {
					max = element;
				}
			}
			
			
		System.out.println("The Largest Number is "+ max);//print the max value
	}
	
	public static void main(String[] args) {
		
		int[] myarr = {1,2,3,4,5,6,9,11};
		
		FindMin(myarr);//calling FindMin method
		FindMax(myarr);//calling FindMax method
		
		
	}
}

