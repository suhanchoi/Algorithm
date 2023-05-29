package skeleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {

    public static void main(String[] args){

        int arr1[] = {1,3,2,1,6,4,2};
        Integer arr2[] = {1,3,2,1,6,4,2};

        Arrays.sort(arr1);

        Arrays.sort(arr2, Collections.reverseOrder());

        Arrays.binarySearch(arr1, 2); // 정렬하면 특정값(2) 반환가능
        // Arrays.binarySortOrder(arr1);

        int temp[] = Arrays.copyOfRange(arr1,2,5);

        // List convertedList = Arrays.asList(arr1); // 오류 확인?

        // collect(Collectors.toList());

//        int[] intArray = {10, 20, 30, 40};
//        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());

        int arrLength = arr1.length // -> 배열 길이

        String str = "123123";
        int strLength = str.length();

        ArrayList<Integer> list = new ArrayList<Integer>(); // upcasting
        int listLength = list.size();






    }


}
