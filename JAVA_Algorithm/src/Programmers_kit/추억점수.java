package Programmers_kit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 06.04 ?��
// ?��로그?��머스 ?��?��?�� ?��?�� ?��?�� ?��?�� ?��?��
public class PRO_?��리기경주 { // https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java
    public static void main(String[] args) {

        // 문자?�� 배열 ?��?�� ?��?�� ?��?��
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3},;
        String[][] photo = {{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        //int[] answer = Solution.solution(name, yearning, photo);

    }
}

class Solution1 {
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

    //System.out.println(photo.length);

    int[] answer = new int[photo.length];

    Map<String, Integer> namePt = new HashMap<String, Integer>();

        for(int i = 0; i < name.length; i++){
        namePt.put(name[i], yearning[i]);
    }

        for(int i = 0; i < photo.length; i++){
        int sum = 0;

        for(int j = 0; j < photo[i].length ; j++){
            if(namePt.containsKey(photo[i][j])) {  // key �? 존재?��?�� 경우?���?
                sum +=  namePt.get(photo[i][j]);
            }

        }
        answer[i] = sum;
    }//System.out.println(Arrays.toString(answer));
}