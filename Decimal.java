package cloverProject.March;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Decimal {
	//How do you sort the given list of decimals in reverse order?
	public static void main(String[] args) {
//		List<Double>arr=Arrays.asList(22.11 ,44.44 ,55.76 ,99.66,66.98);
//		arr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<Integer>arr=Arrays.asList(33,44,55,32,11,65,34);
		arr.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}



}
