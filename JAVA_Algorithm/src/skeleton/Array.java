package skeleton;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Array {
	public static void man(String[] args) {
		
		 	int arr1[] = {1,3,2,1,6,4,2};
	        Integer arr2[] = {1,3,2,1,6,4,2};

	        Arrays.sort(arr1);

	        Arrays.sort(arr2, Collections.reverseOrder());

	        Arrays.binarySearch(arr1, 2); // �젙�젹�븯硫� �듅�젙媛�(2) 諛섑솚媛��뒫
	        // Arrays.binarySortOrder(arr1);

	        int temp[] = Arrays.copyOfRange(arr1,2,5);

	        // List convertedList = Arrays.asList(arr1); // �삤瑜� �솗�씤?

	        // collect(Collectors.toList());

//	        int[] intArray = {10, 20, 30, 40};
//	        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());

	        int arrLength = arr1.length; // -> 諛곗뿴 湲몄씠

	        String str = "123123";
	        int strLength = str.length();

	        ArrayList<Integer> list = new ArrayList<Integer>(); // upcasting
	        int listLength = list.size();

	}
}
