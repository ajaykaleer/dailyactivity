package cloverProject.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {
	//==
	public static void main(String[] args) {
	System.out.println(Arrays.asList(10,20,30,40,50,60)
			.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get());
	
	
			


}
}

