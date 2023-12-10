package day09.hots;

public class SecondMinMax {
	
	
	
	public static void SortArr(int[] array) {
		
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
        	
            for (int j = 0; j < n - i - 1; j++) {
            	
                if (array[j] > array[j + 1]) {
                	
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

	public static void SecondMin(int[] array) {
		SortArr(array);
		System.out.println("The Second Minimum Number in the array is " + array[1]);
		
	}
	
	public static void SecondMax(int[] array) {
		SortArr(array);
		System.out.println("The Second Maximum Number in the array is " + array[array.length-2]);
		
	}
	
    public static void printArray(int[] array) {
    	
        for (int i = 0; i < array.length; i++) {
        	
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
	
    public static void main(String[] args) {
		
    	int[] myarr = {1231,8881,938,65,12354};
    	
    	System.out.print("The Array is ");
    	printArray(myarr);
    	SecondMin(myarr);
    	SecondMax(myarr);

    	
	}

}
