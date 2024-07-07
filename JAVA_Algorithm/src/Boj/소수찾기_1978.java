package Boj;

import java.util.*;

class 소수찾기_1978{ // https://www.acmicpc.net/problem/1978
    public static void main(String args[]){
    		
    	// 4
    	// 1 3 5 7
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	int[] ary = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		ary[i] = sc.nextInt();
    	}
    	
    	// 입력 받은 수(n)들의 소수 개수를 출력
    	
    	// 에라토스테네스의 체 활용
    	// 메모이제이션 활용
    	
    	Arrays.sort(ary); // ary 정렬

    	int[] primeAry = new int[ary[n-1] + 1]; // 소수값 메모이제이션
    	// 선언 시 초기값 false
    	
    	// 소수여부 배열
    	primeAry[0] = 0; // 소수 여부 0 false 1 true
    	primeAry[1] = 0; 
    	
    	for(int i = 2; i <= ary[n-1] ; i ++) {
    		if(isPrime(i)){
    			primeAry[i] = 1;
    		}
    	}
    	
    	int result = 0;
    	
    	// 입력받은 수들 중에서 소수가 몇개인지 판별
    	for(int i : ary) {
    		if(primeAry[i] == 1) {
    			result++;
    		}
    	}
    	
    	System.out.println(result);
    }
	    
    public static boolean isPrime(int num) { // 소수 판별 함수
    	
    	int lim = (int)Math.sqrt(num); // 최댓값 까지 확인 
    	
    	for(int i = 2; i <= lim; i++) {
			if(num % i == 0) {
				return false;
			}
		}
    	return true;
    }
}


