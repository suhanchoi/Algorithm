package skeleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaFn {

    static int a = 10; // class 안에 스태틱 변수 선언
    //다른곳에서 사용 가능

    public static void main(String[] args){

        // length 반환
        //int arrLength = arr1.length // -> 배열 길이

        String str = "123123";
        int strLength = str.length();

        ArrayList<Integer> list = new ArrayList<Integer>(); // upcasting
        int listLength = list.size();


        // collection 정렬
        // sort 단일기준, comparable 복합기준으로 정렬
        /*
        @override
        public int compareTo(Class o){

            if(this.score != o.score){
                return this.score - o.score; // 매개변수가 더 클때 음수 리턴 -> 오름차순
                return o.score - this.score  //                 양수 리턴 -> 내림차순
            }
        }
        */

        /*
        for(int i : abcArr){
            System.out.println(i);
        }
        */






    }


}
