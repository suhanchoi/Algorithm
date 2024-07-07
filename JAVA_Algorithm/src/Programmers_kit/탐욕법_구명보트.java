package Programmers_kit;

import java.util.*;

// 탐욕법 그리디
class 탐욕법_구명보트 { // https://school.programmers.co.kr/learn/courses/30/lessons/42885
    public static void main(String args[]){

    	int[] people= {70, 80, 50};
    	int limit = 100; 

    	// return = 3; 
    	
    	System.out.println(구명보트1.solution(people, limit));
    }
}

class 구명보트1 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        
        // 구명보트 최대 두명
        // 구명보트를 최대한 적게 사용하여 사람 구출
        // 가장 몸무게 많이 나가는 사람 + 가장 몸무게 낮은 사람
        
        Arrays.sort(people); // 정렬
        
        int minIdx = 0;
        
        for(int i = people.length -1; i >= minIdx; i--) { // 몸무게 높은 순에서 낮은순으로 탈출
        	
        	if(people[i] + people[minIdx] <= limit) { // 두명 탈출
        	// 양 끝에서 탈출
        		answer++;
        		minIdx++;
        	} else {
        	// 몸무게 높은 사람만 탈출
        		answer++;
        	}
        	
        	/*//구명보트 최대인원이 2명인지 모른 풀이 
        	tmpSum += people[i];
        	
        	if(tmpSum > limit) {
        		answer++;
        		tmpSum = people[i];
        		
        		if (i == 0) { // 맨 끝사람인 경우
            		answer++;
            	}        	
        	
        	} else if(tmpSum == limit) {
        		answer++;
        		tmpSum = 0;
        		
        	} else if (i == 0) { // 맨 끝사람인 경우
        		answer++;
        	} 
        	*/       	
        }
        
        return answer;
    }
}