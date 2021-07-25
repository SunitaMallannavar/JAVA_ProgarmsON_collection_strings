package java_programs_on_collections;

import java.util.Arrays;

public class FIndDuplicateInArray {

	public static void main(String[] args) {
		
		 //Array declaration
        int arr[] = {2, 5, 3, 1, 8, 7, 5, 3};
 
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
 
              //if value is equal 
              if(arr[i] == arr[j]) {
                 //print the duplicate element
                 System.out.println(arr[i]);
              }
	}
        }
	}
}


