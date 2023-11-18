package Programmers;

import java.util.*;

public class 완주하지못한선수 { // https://school.programmers.co.kr/learn/courses/30/lessons/42576
    public static void main(String[] args) {

        String[] participant = {"mislav", "mislav", "stanko", "mislav", "ana"}; //{"leo", "kiki", "eden"};
        String[] completion = {"stanko", "mislav", "ana", "mislav"};//{"eden", "kiki"};
        String result = 완주하지못한선수1.solution(participant, completion); // "mislav" // "leo"
        System.out.println(result);
        
        // 동명이인이 3명, 2명 인경우는?  -> 5명 완주 / 6명 참가

    }
}

class 완주하지못한선수1 {
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
    		
    		} else { // 동명이인 없는 경우, 완주목록에 참가자가 없음 
    			return part;
    		}
    	}
    	return answer;
    }
}


