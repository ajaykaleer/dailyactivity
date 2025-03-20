package cloverProject.java8;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
	
		//Remove Duplicates from a List
	public static void main(String[] args) {
	//Arrays.asList(2,4,5,3,7,9,,2,4,7).stream().
	
		System.out.println(new HashSet<>(Arrays.asList(2, 4, 5, 3, 7,  2, 4, 7)));
		
		System.out.println(Arrays.asList(2, 4, 5, 3, 7, 2, 4, 7).stream().distinct().toList());


}
}
