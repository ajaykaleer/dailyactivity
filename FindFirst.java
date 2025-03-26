package cloverProject.March;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
	// Given the list of integers, find the first element of the list using Stream functions?
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(10,20,30,26,70,79);
		arr.stream().findFirst().ifPresent(System.out::println);
	      //arr.stream(arr).boxed().findFirst().ifPresent(System.out::print);
		
		
	}



}
