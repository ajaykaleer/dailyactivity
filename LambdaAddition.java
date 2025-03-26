package cloverProject.March;

import java.util.function.BiFunction;

public class LambdaAddition {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> add=(a,b)->a+b;
		System.out.println(add.apply(5,9));
	
		
	}

}
