package cloverProject.March;

import java.util.Arrays;
import java.util.List;

public class TotalNoElement {
	
	//find the total number of elements present in the list using Stream functions?
	
	
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(23,21,65,54,88,43);
		long count = arr.stream().count();
		System.out.println(count);	
		
		
		
	}

}
