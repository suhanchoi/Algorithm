package Programmers;

import java.util.*;

class �̻��ѹ��ڸ���� { // https://school.programmers.co.kr/learn/courses/30/lessons/12930
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

        // �� �ܾ��� ¦���� �빮��
        // �� �ܾ��� Ȧ���� �ҹ��ڷ� �ٲٰ� ��ȯ

        StringBuilder sb = new StringBuilder();
 
        //String[] tempStr = s.split(" ");
        //String[] str = new String[tempStr.length];
        
        String[] str = s.split(" ",-1);
        
        int idx = 0;
        
        System.out.println(Arrays.toString(str));

        for(int i = 0; i < str.length; i++){

            StringBuilder temp =  new StringBuilder();
            

            for(int j = 0; j < str[i].length();j++){
                if(j%2 == 0){ // ¦���� ��� �빮��
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



























