package Programmers;

import java.util.*;

class 이상한문자만들기 { // https://school.programmers.co.kr/learn/courses/30/lessons/12930
    public static void main(String args[]){

    	//String s = "    try hel    lo    w or ld  a ";
    	String s = " try hello  world    a         ";
    	// result "TrY HeLlO WoRlD"
        
        System.out.println(Solution3.solution(s));
    }
}

class Solution3 {
	
    public static String solution(String s) {
        String answer = "";

        // 각 단어의 짝수는 대문자
        // 각 단어의 홀수는 소문자로 바꾸고 반환

        StringBuilder sb = new StringBuilder();
 
        //String[] tempStr = s.split(" ");
        //String[] str = new String[tempStr.length];
        
        String[] str = s.split(" ",-1);
        
        int idx = 0;
        
        System.out.println(Arrays.toString(str));

        for(int i = 0; i < str.length; i++){

            StringBuilder temp =  new StringBuilder();
            

            for(int j = 0; j < str[i].length();j++){
                if(j%2 == 0){ // 짝수일 경우 대문자
                    temp.append(str[i].substring(j,j+1).toUpperCase());
                } else {
                    temp.append(str[i].substring(j,j+1).toLowerCase());
                }
            }
            if(i != str.length - 1){
                sb.append(temp);
                sb.append(" ");
            } else {
                sb.append(temp);
            }
        }

        answer = sb.toString();

        return answer;
    }
}



























