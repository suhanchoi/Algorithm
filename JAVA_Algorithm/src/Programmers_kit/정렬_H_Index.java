package Programmers_kit;

import java.util.*;

public class 정렬_H_Index { // https://school.programmers.co.kr/learn/courses/30/lessons/42747
    public static void main(String args[]){

        int[] citations = {3, 0, 6, 1, 5};
        
        Solution16 sol = new Solution16();
        
        System.out.println(sol.solution(citations));
        // n 편중 h번 이상 인용된 논문이 h 편 이상이라면 h의 최댓값 출력

    }
}

class Solution16 {
    public int solution(int[] citations) {
        int answer = 0;

        Integer[] temp = new Integer[citations.length];

        int j = 0;
        for(int i : citations){
            temp[j] = i;
            j++;
        }

        Arrays.sort(temp, Collections.reverseOrder());
        // desc 정렬

        int idx = temp[0];
        boolean isFin = false;

        while(idx > -1) {

            for(int i = 1; i < temp.length; i++){
                if(temp[i] >= idx && i+1 >= idx) {
                	return idx;
                }
            }
            idx--;
        }
        return answer;
    }
}