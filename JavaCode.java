package cloverProject.March;

import java.util.Arrays;
import java.util.List;

public class JavaCode {
	public static void main(String [] args) {
		
	//From the given list of integers, print the numbers which are multiples of 5?


		List<Integer>abc=Arrays.asList(45,50,33,44,15,20,99);
		abc.stream().filter(i->i%10==0).forEach(System.out::println);
	}

}
