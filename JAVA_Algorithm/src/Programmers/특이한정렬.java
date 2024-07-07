package Programmers;

import java.util.*;


class 특이한정렬 { // https://school.programmers.co.kr/learn/courses/30/lessons/120880
    public static void main(String args[]){

    	int numlist[] = {1, 2, 3, 4, 5, 6};
    	int n = 4;
    	// result [4, 5, 3, 6, 2, 1]
        
        System.out.println(Solution.solution(numlist, n));
    }
}

class Solution {
	
    public static int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
        // n 과 가까운 순으로 정렬
        // n 과 거리가 같다면 큰 수를 앞에 배치


        Arrays.sort(numlist);

        for(int i = 0; i < numlist.length; i++){
            for(int j = 0; j < numlist.length; j++){
                if(Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        return numlist;
    }
}





























