package cloverProject.java8;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EvenNumber {


	// Find Even Numbers in a List using Java 8 Streams
	// 2, 3, 8, 9, 6, 4;
	//List<Integer> number= Arrays.asList (2, 3, 8, 9, 6, 4);

    public static void main(String[] args) {
    	System.out.println("even no is :");
	Arrays.asList(2, 3, 8, 9, 6, 4).stream()
	
	.filter(n->n%2==0)
	.forEach(System.out::println);
	
    }
    }
