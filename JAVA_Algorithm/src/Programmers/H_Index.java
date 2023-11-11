package Programmers;

import java.util.*;

public class H_Index { // https://school.programmers.co.kr/learn/courses/30/lessons/42747
    public static void main(String args[]){

        int[] citations = {3, 0, 6, 1, 5};

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

        int idx = temp[0];
        boolean isFin = false;

        while(idx > -1) {

            for(int i = 0; i < temp.length; i++){
                if(temp[i] >= idx && i+1 >= idx) {
                    answer = idx;
                    isFin = true;
                    break;
                }
            }
            if(isFin)
                break;

            idx--;
        }
        return answer;
    }
}