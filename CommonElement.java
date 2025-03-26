package cloverProject.March;

import java.util.Arrays;
import java.util.List;

public class CommonElement {
	// How do you find common elements between two arrays?
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(21,33,44,11,34,55);
	    List<Integer>arr1=Arrays.asList(12,21,33,55,16,99);
	    
	    arr.stream().filter(arr1::contains).forEach(System.out::println);
				
	}


}
