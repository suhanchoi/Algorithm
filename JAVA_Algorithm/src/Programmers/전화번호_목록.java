package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 전화번호_목록 { public static void main(String args[]){ // https://school.programmers.co.kr/learn/courses/30/lessons/42577
    String[] phone_book = {"119", "97674223", "1195524421"};
    }
}


class Solution7 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<String, Integer>();


        /* // 시간초과
        int i = 0;
        for(String input : phone_book){
            map.put(i, input);
            i++;
        }

        String A;
        String B;

        for(i = 0; i < phone_book.length; i++){
            for(int j = 0 ; j < phone_book.length; j++){
                if(i == j)
                    continue;

                A = map.get(i);
                B = map.get(j);

                if(A.length() > B.length())
                    continue;
                if(B.startsWith(A))
                    return false;
            }
        }
        */
        // 같은번호가 중복하지 않으므로, 전체 문자열이 같은 경우는 없음

        int i = 0;
        for(String input : phone_book){
            map.put(input, i);
            i++;
        }
        for(i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length; j++) {
                if(map.containsKey(phone_book[i].substring(0,j))) // 0 ~ j-1
                    return false;
            }
        }


        return answer;
    }
}