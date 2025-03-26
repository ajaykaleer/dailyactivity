package cloverProject.March;

import java.util.Arrays;
import java.util.List;

public class Sort {
	//Given a list of integers, sort all the values present in it using Stream functions?
	public static void main(String [] args) {
	
	List<Integer>arr=Arrays.asList(20,32,54,65,34,21,3,4);
	arr.stream() .sorted() .forEach(System.out::println);	


}
}