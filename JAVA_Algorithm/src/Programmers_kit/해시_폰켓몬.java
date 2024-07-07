package Programmers_kit;

import java.util.*;

public class 해시_폰켓몬 { // https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        int result = 폰켓몬1.solution(nums); // 2;

    }
}

class 폰켓몬1 {
    public static int solution(int[] nums) {
        
    	int answer = 0;
        
        // 최대한 많은 종류의 폰켓몬을 골라야함
        // 폰켓몬 종류 번호의 개수를 return

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.contains(1);
        set.remove(1);

        Iterator<Integer> it = set.iterator();
        it.hasNext();
        it.next();
    	
    	int n = nums.length / 2;
    	
    	Arrays.sort(nums); // nums 배열 

    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i = 0; i < nums.length ; i++) {
    		
    		if(!map.containsKey(nums[i])) {
    			map.put(nums[i], 1);
    		}
    	}
        
    	// 만약 종류가 선택하는 수 제한보다 높으면 , 최대 종류수는 선택하는 수의 최댓값
        if(map.size() > n){ 
            answer = n;
        } else {
            answer = map.size();
        }
        
    	return answer;
    }
}