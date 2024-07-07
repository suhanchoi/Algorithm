package Programmers_kit;

import java.util.*;

public class 힙_더맵게 { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        
        Solution14 sol = new Solution14();
        System.out.println(sol.solution(scoville, K));

    }
}

class Solution14 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        long k = (long) K;
        PriorityQueue<Long> pq = new PriorityQueue<>(); // 최소가 맨앞 오름차순
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 최대가 맨앞 내림차순

        for(int i : scoville){
            pq.offer((long)i);
        }

        while(true){

            if(!pq.isEmpty() && pq.peek() > k)
                break;

            if(!pq.isEmpty()){ // 음식 섞기
                pq.offer(pq.poll() + pq.poll() * 2);
                answer += 1;
            }

            if(pq.size() < 2){ // 못만드는 경우
                answer = -1;
                break;
            }
        }
        return answer;
    }
}