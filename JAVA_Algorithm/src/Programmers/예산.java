package Programmers;

import java.util.*;

class 예산 { // https://school.programmers.co.kr/learn/courses/30/lessons/12982
    public static void main(String args[]){

    	int d[] = {1, 2, 3, 4};
        int budget = 9;
    	// result 3
        
        System.out.println(Solution2.solution(d, budget));
    }
}

class Solution2 {
	
    public static int solution(int[] d, int budget) {
        int answer = 0;

        // 최대한의 budget으로 구입 가능한 개수 반환

        Arrays.sort(d);

        int sum = 0;

        for (int i = 0; i < d.length; i++){
            sum += d[i];
            if (sum <= budget){
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}





























