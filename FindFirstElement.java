package cloverProject.java8;

import java.util.Arrays;

public class FindFirstElement {
	// Find the First Element in a List
	//Arrays.asList(5,8,9,4,6,2,1).stream().FindFirst()
	public static void main(String[] args) {
		
	
	System.out.println(Arrays.asList(5, 8, 9, 4, 6, 2, 1).get(0));
	
	
	// Using stream().findFirst()

	System.out.println(Arrays.asList(5, 8, 9, 4, 6, 2, 1).stream().findFirst().get());


	}
}
