package Programmers_kit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 06.04 ?
// ?λ‘κ·Έ?λ¨Έμ€ ??? ?¨? ? ?Έ ??Έ ??
public class PRO_?¬λ¦¬κΈ°κ²½μ£Ό { // https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java
    public static void main(String[] args) {

        // λ¬Έμ?΄ λ°°μ΄ ? ?Έ ??Έ ??
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
            if(namePt.containsKey(photo[i][j])) {  // key κ°? μ‘΄μ¬?? κ²½μ°?λ§?
                sum +=  namePt.get(photo[i][j]);
            }

        }
        answer[i] = sum;
    }//System.out.println(Arrays.toString(answer));
}