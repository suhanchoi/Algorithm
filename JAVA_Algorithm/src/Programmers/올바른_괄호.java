package Programmers;

import java.util.*;

public class 올바른_괄호 { // https://school.programmers.co.kr/learn/courses/30/lessons/12909
    public static void main(String args[]){
       String s = "()()";
    }
}


class Solution2 {
    boolean solution(String s) {
        boolean answer = true;

        // Stack 으로 풀이
        Stack<String> st = new Stack<>();
        /*
        String[] input = s.split("");

        for(String in : input){
            if("(".equals(in)){
                st.push(in);
                break;
            } else if (")".equals(in)) {
                if(st.isEmpty()) {
                    answer = false;
                    break;
                } else if (!"(".equals(st.peek())) {
                    answer = false;
                    break;
                }
                st.pop();
            }
        }
        */ // String 보다 Character 로 풀면 시간 효율성 UP

        for(int i = 0; i < s.length(); i++){
            if('(' == s.charAt(i)){
                st.push('(');
            } else {
                if(st.isEmpty()) {
                    return  false;
                } else if (!('(' == st.peek())) {
                    return false;
                }
                st.pop();
            }
        }

        if(!st.isEmpty())
            return false;


        if(!st.isEmpty())
            answer = false;

        /* Iterator 변환
        Iterator it = st.iterator();

        while(it.hasNext()){
            if(it.next()
        }

        System.out.println(st);
        */


        return answer;
    }
}

