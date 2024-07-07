package Programmers_kit;

import java.util.*;

public class 정렬_가장큰수 { // https://school.programmers.co.kr/learn/courses/30/lessons/42746
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
                return (n2+n1).compareTo(n1+n2); // �궗�쟾�닚 �젙�젹
            }
        });

        int zero = 0;
        for(String str : temp){
            if("0".equals(str)){
                zero++;
            }
            sb.append(str);
        }

        if(zero == numbers.length) { // �쟾遺� 0�씤 寃쎌슦
            sb = new StringBuilder();
            sb.append("0");
        }

        answer = sb.toString();

        return answer;
    }
}