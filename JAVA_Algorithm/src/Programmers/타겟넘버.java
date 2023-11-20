package Programmers;

import java.util.*;

// dfs / bfs
class 타겟넘버 { // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public static void main(String args[]){

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        //int return = 5;
        
        System.out.println(타겟넘버1.solution(numbers, target));
    }
}

class 타겟넘버1 {
	
	static int answer;
	
    public static int solution(int[] numbers, int target) {
        
    	answer = 0;
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int depth, int sum){
    	
    	if (depth == numbers.length) {
    		if(sum == target) {
    			answer++;
    		}
    		return;
    	}
    	
    	// 이 부분이 핵심
        // 더하고 빼는 경우 모두 호출
    	dfs(numbers, target, depth + 1, sum + numbers[depth]);
    	dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}



































