package Programmers_kit;

import java.util.Arrays;

public class μ΅μκ°?_λ§λ€κΈ? {
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

        // ??  μ΅μκ°? : κ°λ°°?΄? μ΅λκ°κ³Ό μ΅μκ°μ κ³±μ μ΄ν©
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}