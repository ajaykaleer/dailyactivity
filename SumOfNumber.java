package cloverProject.java8;

import java.util.Arrays;

public class SumOfNumber {
	// Find the Sum of Elements in a List
	//2, 3, 8, 9, 6, 4
	public static void main(String[] args) {
		
	
	int sum=Arrays.asList(2, 3, 8, 9, 6, 4)	.stream()
			.mapToInt(Integer::intValue)
			.sum();
	
			
	
	System.out.println("Sum is : "+ sum );
    

}
}
