package cloverProject.java8;

import java.util.Arrays;
import java.util.List;

import java.util.List;

public class UpperCaseConvertor {
	//List<String> name=Arrays.asList("amit","sumit","raj");
	
	public static void main(String[] args){
  
  Arrays.asList("AJAY","AMIT","RAJ")
  .stream()
  .map(String::toLowerCase)
  .forEach(System.out::println);
  
  
  
}
}


//List<String> names = Arrays.asList("ajay", "john", "kale");
//
//List<String> upperCaseNames = names.stream()
//                                   .map(String::toUpperCase)
//                                   .collect(Collectors.toList());
//
//System.out.println("Uppercase Names: " + upperCaseNames);
//}
