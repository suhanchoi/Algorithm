package Programmers_kit;

import java.util.*;

public class ��Ž_�ּ����簢�� { // https://school.programmers.co.kr/learn/courses/30/lessons/42840
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

        // ������ ������ ȸ���� ������ ���� -> ����, ���� -> ����
        // ���� �� ����, ���� ������ ��Ƽ� ������ ������ ��� ������ �� �� ����
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


