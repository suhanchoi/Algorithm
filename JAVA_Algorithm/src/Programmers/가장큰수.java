package Programmers;

import java.util.*;

public class 가장큰수 { // https://school.programmers.co.kr/learn/courses/30/lessons/42746
    public static void main(String args[]){

        int[] numbers = {6, 10, 2};

    }
}

class Solution15 {
    public String solution(int[] numbers) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        String[] temp = new String[numbers.length];

        int i = 0;
        for(int n : numbers){
            temp[i] = Integer.toString(n);
            i++;
        }

        Arrays.sort(temp, new Comparator<String>(){
            @Override
            public int compare(String n1, String n2){
                return (n2+n1).compareTo(n1+n2); // 사전순 정렬
            }
        });

        int zero = 0;
        for(String str : temp){
            if("0".equals(str)){
                zero++;
            }
            sb.append(str);
        }

        if(zero == numbers.length) { // 전부 0인 경우
            sb = new StringBuilder();
            sb.append("0");
        }

        answer = sb.toString();

        return answer;
    }
}