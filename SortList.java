package cloverProject.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SortList {
	// Sort a List in Ascending and Descending Order
	public static void main(String[] args) {
		
	
	
	//Sort in Ascending Order (Natural Order)
		System.out.println("Ascending Order is :");

	System.out.println(Arrays.asList(2, 3, 4, 5, 6, 1, 9, 8).stream().sorted().toList());
	
	System.out.println("descending Order is :");

	 //	Sort in Descending Order (Reverse Order)
	System.out.println(Arrays.asList(2, 3, 4, 5, 6, 1, 9, 8).stream().sorted(Comparator.reverseOrder()).toList());
	
	



	}
}
