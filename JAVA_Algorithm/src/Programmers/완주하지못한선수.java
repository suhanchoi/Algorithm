package Programmers;

import java.util.*;

public class �����������Ѽ��� { // https://school.programmers.co.kr/learn/courses/30/lessons/42576
    public static void main(String[] args) {

        String[] participant = {"mislav", "mislav", "stanko", "mislav", "ana"}; //{"leo", "kiki", "eden"};
        String[] completion = {"stanko", "mislav", "ana", "mislav"};//{"eden", "kiki"};
        String result = �����������Ѽ���1.solution(participant, completion); // "mislav" // "leo"
        System.out.println(result);
        
        // ���������� 3��, 2�� �ΰ���?  -> 5�� ���� / 6�� ����

    }
}

class �����������Ѽ���1 {
    public static String solution(String[] participant, String[] completion) {
        
    	String answer = "";
    	
    	Map<String, Integer> cmap = new HashMap<String, Integer>();
    	
    	for(String com : completion) {
    		
    		cmap.put(com, cmap.getOrDefault(com, 0) + 1);
    		
    		
    		/*
    		if(cmap.containsKey(com)){
    			cmap.replace(com, cmap.get(com) + 1);
    		} else {
    			cmap.put(com, 1);
    		}
    		*/
    	}
    	
    	System.out.println(cmap.toString());

    	for(String part : participant) {
    		
    		if(cmap.containsKey(part)){
    			int getValue = cmap.get(part);
    			cmap.put(part, getValue -1);
    			if(cmap.get(part) == -1) {
    				return part;
    			}
    		
    		} else { // �������� ���� ���, ���ָ�Ͽ� �����ڰ� ���� 
    			return part;
    		}
    	}
    	return answer;
    }
}


