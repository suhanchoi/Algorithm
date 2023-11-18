package Programmers;

import java.util.*;

// Ž��� �׸���
class ū������� { // https://school.programmers.co.kr/learn/courses/30/lessons/42883
    public static void main(String args[]){

    	String number= "1924";
    	int k = 2; 
    	
    	// return = "94" 
    	
    	System.out.println(ū�������1.solution(number, k));
    }
}

class ū�������1 {
    public static String solution(String number, int k) {
        String answer = "";
        
        // ���ڿ� number ������ k���� �� ���� �� ���� �� �ִ� ���� ū ���� return
        // ���ڿ� ���·� k���� ������, ������ ���� ����
        // k�� ���� �Ҷ����� �չ��ڰ� �޹��ں��� ũ�ٸ�, �չ��ڸ� ������
        
        
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
        // stack Ǯ��
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
        
        /*//����Ǯ�� 1
        ArrayList<Integer> list = new ArrayList<>();
        
    	for(int i = 0; i < number.length(); i++) {
    		list.add(Integer.parseInt(number.substring(i, i+1))); // �ѱ��ھ�
    	}
        
    	
       
    	StringBuilder sb = new StringBuilder();
    	
    	for(Integer j : list) {
    		sb.append(j.toString());
    	}
    	
    	answer = sb.toString().substring(0, number.length() - k);
        */

        /* // ����Ǯ�� 2
        for(int i = 0; i < number.length() - k +1; i++) {
        	
        	list = new ArrayList<>();
        	
        	String tmp = number.substring(i, i + ( number.length() - k));
        	System.out.println("i : " + i +" tmp : " + tmp);
        	
        	for(int j = 0; j < tmp.length(); j++) {
        		list.add(Integer.parseInt(tmp.substring(j, j+1))); // �ѱ��ھ�
        	}
        	
        	Collections.sort(list, Collections.reverseOrder()); // �������� ����
        	
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