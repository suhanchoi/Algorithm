package Programmers_kit;

import java.util.*;

public class 스택큐_올바른_괄호 { // https://school.programmers.co.kr/learn/courses/30/lessons/12909
    public static void main(String args[]){
       String s = "()()";
       //String false_s = "()())";
       
       Solution2 sol = new Solution2();
       System.out.println(sol.solution(s));
    }
}


class Solution2 {
    boolean solution(String s) {
        boolean answer = true;

        // Stack 으로 풀이
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if('(' == s.charAt(i)){
                st.push('('); // stack 삽입
            } else { // ')' 인 경우
                if(st.isEmpty()) {
                    return  false;
                } else if (!('(' == st.peek())) {
                    return false;
                }
                st.pop();
            }
        }
        
        if(!st.isEmpty()) // 짝이 안맞다면
            return false;

        return answer;
    }
}
        
        /*
        // Stack �쑝濡� ���씠
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
        */ // String 蹂대떎 Character 濡� ��硫� �떆媛� �슚�쑉�꽦 UP


 /* eclipse 풀이 -----------------------------------
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
        return answer;
        }
     }
        */ // -----------------------------------



        /* Iterator 蹂��솚
        Iterator it = st.iterator();

        while(it.hasNext()){
            if(it.next()
        }

        System.out.println(st);
        */


        
        

