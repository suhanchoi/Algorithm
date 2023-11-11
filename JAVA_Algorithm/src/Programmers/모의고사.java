package Programmers;

import java.util.*;

public class 모의고사 { // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public static void main(String args[]){

        int[] answers = new int[]{1, 2, 3, 4, 5}; // ->s {1}
        //  = new int[]{1, 3, 2, 4, 2} -> {1,2,3}

    }
}

class Solution20 {

    //static int answer;
    //static boolean[] visited;

    public int[] solution(int[] answers) {
        int[] answer = {};

        // 수포자 1 -> 1, 2, 3, 4, 5,    1, 2, 3, 4, 5,
        // 수포자 2 -> 2, 1, 2, 3, 2, 4, 2, 5,    2, 1, 2, 3, 2, 4, 2, 5,
        // 수포자 3 -> 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,   3, 3, 1, 1, 2, 2, 4, 4, 5,

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for(int i = 0; i < answers.length; i++){

        }


        return answer;
    }
}



