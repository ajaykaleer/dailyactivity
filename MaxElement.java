package cloverProject.java8;

import java.util.Arrays;

public class MaxElement {
	// Find the Maximum Element in a List
	
	public static void main(String[] args) {
		System.out.println(Arrays.asList(2,4,6,8,13).stream().max(Integer :: compare).get());
	
	
		

}
}
