package cloverProject.March;

import java.util.Arrays;
import java.util.List;

public class Sum {
	
	//Que.sum of all element of an array
	
	public static void main(String[] args) {
	List<Integer> arr=Arrays.asList(2,3,4,5,6,7,8,9,10);
	int sum = Arrays.stream(arr).sum();
	
    
}
}
