package Programmers;

import java.util.*;

public class 더맵게 { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

    }
}

class Solution14 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        long k = (long) K;
        PriorityQueue<Long> pq = new PriorityQueue<>(); // 최소가 맨압 오름차순
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 최대가 맨압 내림차순

        for(int i : scoville){
            pq.offer((long)i);
        }


        while(true){

            if(!pq.isEmpty() && pq.peek() > k)
                break;

            if(!pq.isEmpty()){
                pq.offer(pq.poll() + pq.poll() * 2);
                answer += 1;
            }

            if(pq.size() < 2){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}