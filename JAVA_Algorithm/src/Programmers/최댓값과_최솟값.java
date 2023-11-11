package Programmers;

public class 최댓값과_최솟값 { // https://school.programmers.co.kr/learn/courses/30/lessons/12939
    public static void main(String[] args) {

        String s = "1 2 3 4";





    }
}


class Solution4 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;


        String[] in = s.split(" ");

        int[] input = new int[in.length];

        int i = 0;
        for(String str : in){
            input[i] = Integer.parseInt(str);
            i++;
        }

        for(i = 0; i < input.length; i++){
            max = Math.max(max,input[i]);
            min = Math.min(min,input[i]);
        }

        sb.append(min + " " + max);

        answer = sb.toString();

        return answer;
    }
}