package Programmers;

import java.util.*;

// 완전탐색 브루트포스
class 소수찾기 { // https://school.programmers.co.kr/learn/courses/30/lessons/42839?language=java
    public static void main(String args[]){

        String numbers = "17";
        //int return = 3; // "7" "17" "71"
        
        System.out.println(소수찾기1.solution(numbers));
    }
}

class 소수찾기1 {
	
	static HashSet<Integer> set = new HashSet<>();
	
    public static int solution(String numbers) { // 에라토스테네스의 체
    	//  https://www.youtube.com/watch?v=pF368QqdQb4&list=PLlV7zJmoG4XI9VguUVNMu3pCjssb4aR_0&index=3&ab_channel=%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%A1%9C%EC%B7%A8%EC%A7%81%ED%95%98%EA%B8%B0 참고
        
    	int answer = 0;
        
        // 모든 숫자들의 조합에서 소수의 개수를 반환
    	// 생성 가능한 모든 숫자 조합은 재귀함수로 생성
    	// set으로 중복 조합 제거
    	// 소수 판단은 에라토스테네스의 체 활용
    	// -> 해당 숫자의 제곱근 까지의 값까지만 파악하면 소수인지 판단 가능
    	
    	recursive("", numbers); // 재귀함수로 조합가능한 숫자 생성
    	
        Iterator<Integer> it = set.iterator();
        
        while(it.hasNext()) {
        	int num = it.next();
        	if(isPrime(num))
        		answer++;
        			
        }

        return answer;
    }
    
    // 재귀로 숫자 조합 생성 
    public static void recursive(String comb, String others) {
    	if(!"".equals(comb)) {
    		set.add(Integer.parseInt(comb));
    	}
    	
    	for(int i = 0; i < others.length(); i++) {
    		// i 넣고, 나머지 추가 후 재귀호출
    		recursive(comb + others.charAt(i) , others.substring(0, i) + others.substring(i+1));
    	}
    }
    
    // 소수판별
    // 에라토스테네스의 체 활용
    public static boolean isPrime(int num) { 
    	
    	if(num == 0 || num ==1) {
    		return false;
    	}
    	
    	int lim = (int)Math.sqrt(num); // limit 지정
    	
    	for(int i = 2; i <=lim; i++) { // i는 2부터 <= lim 한계까지
    		if(num % i == 0) { // 나뉘게 되면 소수가 아님
    			return false;
    		}
    	}
    	return true;
    }
}





































