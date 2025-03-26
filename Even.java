package cloverProject.March;

import java.util.stream.IntStream;

public class Even {
	// Print first 10 even numbers
	public static void main(String[] args) {
		System.out.println("even no is :");
		IntStream.rangeClosed(1,5).map(i->i*2).forEach(System.out::println );
	}



}
