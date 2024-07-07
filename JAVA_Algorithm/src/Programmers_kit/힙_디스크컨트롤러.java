package Programmers_kit;

import java.util.*;

public class 힙_디스크컨트롤러 { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        
        // 요청된시간, 소요시간
				
        System.out.println(디스크컨트롤러.solution(jobs));
    }
}

class 디스크컨트롤러{
    public static int solution(int[][] jobs) {
        int answer = 0;
        
        // 끝나는 시간을 기준으로 정렬하고
        // 처리해야함
        // 회의실 문제랑 유사
      
        // 각 작업의 요청부터 종료까지 걸린 시간의 평균
        
        // 요청된 시간이 작을수록 먼저 실행, 오름차순
        // 소요되는 시간이 적을수록 먼저 실행, 오름차순
        
        // -> pq 에 위와같은 우선순위로 정렬

        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        
        // (o1, o2) -> o1[0] - o2[0];
        // -> Comparator compare 을 람다형식으로 표현
        
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); // 요청된 시간 작을수록 정렬 오름차순
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // 소요시간 짧은 순부터 오름차순
        
        int cnt = 0; // 처리개수
        int idx = 0; // 처리 인덱스
        
        int sum = 0; // 시간 총합
        int end = 0; // 각 작업 완료시점

        while(cnt < jobs.length) {
        	
        	// 끝까지 닿지 않았고, 종료 시점 전에 시작시간이 있는것들 pq 에 추가
        	while(idx < jobs.length && jobs[idx][0] <= end) {
        		pq.add(jobs[idx++]);
        	}
        	
        	if(pq.isEmpty()) { // 작업 목록이 없다면
        		end = jobs[idx][0]; // 새로운 요청이 들어오도록 세팅
        	} else { // 작업 목록이 있다면
        		int[] temp = pq.poll();
        		
        		sum += temp[1] + end - temp[0]; // 소요시간 총합 계산
        		end += temp[1]; // 소요시간 업데이트
        		cnt++; // 처리개수 업데이트
        	}
        }

        return sum / jobs.length;
    }
}