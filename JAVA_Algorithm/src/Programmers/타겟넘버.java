package Programmers;

import java.util.*;

// dfs / bfs
class Å¸°Ù³Ñ¹ö { // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public static void main(String args[]){

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        //int return = 5;
        
        System.out.println(Å¸°Ù³Ñ¹ö1.solution(numbers, target));
    }
}

class Å¸°Ù³Ñ¹ö1 {
	
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
    	dfs(numbers, target, depth + 1, sum + numbers[depth]);
    	dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}



































