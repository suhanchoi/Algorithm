package Programmers_kit;

import java.util.Arrays;

public class ìµœì†Ÿê°?_ë§Œë“¤ê¸? {
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

        // ?ˆ„?  ìµœì†Ÿê°? : ê°ë°°?—´?˜ ìµœëŒ“ê°’ê³¼ ìµœì†Ÿê°’ì˜ ê³±ì˜ ì´í•©
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length - 1 - i];
        }
        return answer;
    }
}