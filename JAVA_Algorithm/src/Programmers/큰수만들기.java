package Programmers;

import java.util.*;

// 탐욕법 그리디
class 큰수만들기 { // https://school.programmers.co.kr/learn/courses/30/lessons/42883
    public static void main(String args[]){

    	String number= "1924";
    	int k = 2; 
    	
    	// return = "94" 
    	
    	System.out.println(큰수만들기1.solution(number, k));
    }
}

class 큰수만들기1 {
    public static String solution(String number, int k) {
        String answer = "";
        
        // 문자열 number 수에서 k개의 수 제거 시 얻을 수 있는 가장 큰 수를 return
        // 문자열 형태로 k개를 제거함, 정렬을 하지 않음
        // k개 제외 할때까지 앞문자가 뒷문자보다 크다면, 앞문자를 제거함
        
        
        int idx = 0;
        int max = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < number.length()- k; i ++) {
        	
        	max = 0;
        	
        	for(int j = idx; j < i + k +1 ; j++) {
        		if(max < number.charAt(j) -'0') {
        			max = number.charAt(j) -'0';
        			idx = j +1;
        		}
        	}
        	
        	sb.append(max);        	
        }
        
        answer = sb.toString();
        
        return answer;
        
        /*
        // stack 풀이
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < number.length()- k; i ++) {
        	
        	if(i == 0) {
        		st.push(number.charAt(i) -'0');
        	}
        	
        	if(!st.isEmpty() && st.peek() < number.charAt(i) -'0'){
        		st.pop();
        		st.push(number.charAt(i) -'0');
        	}
        	
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < st.size(); i ++) {
        	sb.append(st.pop().toString());
        }
        
        sb.reverse();
        answer = sb.toString();
        
        return answer;
        */
        
        /*//실패풀이 1
        ArrayList<Integer> list = new ArrayList<>();
        
    	for(int i = 0; i < number.length(); i++) {
    		list.add(Integer.parseInt(number.substring(i, i+1))); // 한글자씩
    	}
        
    	
       
    	StringBuilder sb = new StringBuilder();
    	
    	for(Integer j : list) {
    		sb.append(j.toString());
    	}
    	
    	answer = sb.toString().substring(0, number.length() - k);
        */

        /* // 실패풀이 2
        for(int i = 0; i < number.length() - k +1; i++) {
        	
        	list = new ArrayList<>();
        	
        	String tmp = number.substring(i, i + ( number.length() - k));
        	System.out.println("i : " + i +" tmp : " + tmp);
        	
        	for(int j = 0; j < tmp.length(); j++) {
        		list.add(Integer.parseInt(tmp.substring(j, j+1))); // 한글자씩
        	}
        	
        	Collections.sort(list, Collections.reverseOrder()); // 역순으로 정렬
        	
        	StringBuilder sb = new StringBuilder();
        	
        	for(Integer j : list) {
        		sb.append(j.toString());
        	}
        	
        	System.out.println("test : " + sb.toString());

        	maxNum = Math.max(maxNum, Integer.parseInt(sb.toString()));
        	}
        */

    }
}