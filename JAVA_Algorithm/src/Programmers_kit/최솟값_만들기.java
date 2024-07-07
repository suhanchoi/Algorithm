package Programmers_kit;

import java.util.Arrays;

public class 최솟�?_만들�? {
    public static void main(String args[]){
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
    }
}


class Solution6 {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        // ?��?�� 최솟�? : 각배?��?�� 최댓값과 최솟값의 곱의 총합
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}