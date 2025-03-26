package cloverProject.March;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
	//4) How do you find frequency of each element in an array or a list?
	public static void main(String[] args) {
	List<String> arr=Arrays.asList("clover","aman","java","pc","pc");
	Map<String, Long> frequncy = arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("frequency is:"+frequncy);



}
}
