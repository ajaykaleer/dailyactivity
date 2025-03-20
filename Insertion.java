package cloverProject.java8;

import java.util.Arrays;

public class Insertion {
	//java 7
//	Question: Write a java program to sort the elements of array using insertion sort.
//	Input: {Question: Write a java program to sort the elements of array using insertion sort.
//	Input: {4,6,1,5,2,7}
//	Output: {1,2,4,5,6,7}


	      public static void main(String[] args) {
          int[] arr = {4, 6, 1, 5, 2, 7};
          
           Arrays.sort(arr); 
                  

          System.out.println(Arrays.toString(arr));  
//          System.out.println("Even numbers are: ");
//
//    //even  find  
//           for (int even : arr) {
//               if (even % 2 == 0) {
//                   System.out.	print( even + " " );
//	      } 
//}
//	      }
//}
 //odd no.find
       System.out.println("odd numbers are: ");
//
    for (int odd:arr) {
    	if(odd%2!=0) {
   		System.out.println(odd +" ");
   	}
  }
//	      }
//}

 // System.out.println("Last element: " + arr[arr.length - 1]);
//	      }

// Printing the first element of the array
 System.out.println("First element: " + arr[0]);
}
//}
 
	int sum = 0;

// Loop through the array and add each element to sum
 for (int num : arr) {
    sum += num;
}

// Print the sum
System.out.println("Sum of array elements: " + sum);

}
}



    // JAVA 8 
	      
   

   
   
	
	


	
   


