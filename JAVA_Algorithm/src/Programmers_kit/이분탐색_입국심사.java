package Programmers_kit;

import java.util.*;

// 이분탐색
class 이분탐색_입국심사 { // https://school.programmers.co.kr/learn/courses/30/lessons/43238
    public static void main(String args[]){

        
        int n = 6;
        int[] times = {7, 10};
        //int return = 28;
        
        System.out.println(입국심사1.solution(n, times));
    }
}

class 입국심사1 {
	public static long solution(int n, int[] times) {
        long answer = 0;
        
        // 심사받는 시간을 최소화
        // n 기다리는 사람 수
        // times은 각 심사관이 한명을 심사하는데 걸리는 시간 배열
        // 비었더라도 빨리끝나는곳에 가서 심사 받기가 가능 
        Arrays.sort(times);
        
        // 시간을 기준으로 max min 이분탐색 확인
        long min = 0, max = (long)n * (long)(times[times.length -1]) , mid;

        while(min <= max) { // 탈출하게 된다면, 그때의 mid가 정답
        	
        	int sum = 0; // 심사한 인원 -> n이 되면 종료
        	
        	mid = (min + max) / 2; // mid 걸린 시간
        	
        	for(int i = 0; i < times.length; i++) {
        		sum += mid / times[i]; // 시간을 통해 심사한 사람들
        		// 시간의 최솟값을 걸리는 시간으로 나눠서
        		// 사람명 수를 통해 이분탐색 
        	}
        	
        	if (sum < n) { // 검사를 다 받지 못했다. 즉 시간이 부족함
        		min = mid + 1; // 오른쪽 구간 탐색
        		
        	} else { // 검사를 다 하긴 했지만 더 최적이 있을 수 있다.
        		// sum == n 경우는 딱 맞아 떨어지지 않을 수 있기 때문에 else로 처리
        		max = mid - 1; // 왼쪽 구간 탐색
        		answer = mid;
        	}
        }
        return answer;
    }
}































