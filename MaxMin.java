package cloverProject.March;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
	// Given a list of integers, find maximum and minimum of those numbers?
	
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(22,33,44,55,66,77,88,99);
		int max=arr.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maximum Element :"+max);
		int min=arr.stream().min(Comparator.naturalOrder()).get();
		System.out.println("minimum Element :"+min);
		//arr.stream().filter(i->i%2==0).forEach(System.out::println);
		
		
	}
	



}
