package cloverProject.java8;

import java.util.Arrays;

public class FilterWord {
	//Find Words Starting with a Specific Letter
	public static void main(String[] args) {
		
	
	System.out.println(Arrays.asList("Amit","Anjali","Amar","raj","pavan").stream().filter(x->x.startsWith("A")).toList());
	
	}

}
