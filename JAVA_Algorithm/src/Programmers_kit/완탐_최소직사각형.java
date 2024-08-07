package Programmers_kit;

import java.util.*;

public class 완탐_최소직사각형 { // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public static void main(String args[]){

        int[][] sizes = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        // 4000

        System.out.println(Solution21.solution(sizes));
    }
}

class Solution21 {

    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxA = 0;
        int maxB = 0;

        int max_len, min_len;

        // 명함을 옆으로 회전이 가능함 가로 -> 세로, 세로 -> 가로
        // 가장 긴 가로, 세로 기준을 잡아서 지갑을 만들어야 모든 명함이 들어갈 수 있음
        for(int i = 0; i < sizes.length ; i++) {

            max_len = Math.max(sizes[i][0], sizes[i][1]);
            min_len = Math.min(sizes[i][0], sizes[i][1]);

            maxA = Math.max(maxA, max_len);
            maxB = Math.max(maxB, min_len);
        }

        answer = maxA * maxB;

        /*

            a = sizes[i][0];
            b = sizes[i][1];


            if (a >= b){
                if(a > maxA){
                    maxA = a;
                }
                if(b > maxB){
                    maxB = b;
                }
            } else {
                if(b > maxA){
                    maxA = b;
                }
                if(a > maxB){
                    maxB = a;
                }
            }
        }
        */

        answer = maxA * maxB;

        return answer;
    }
}


