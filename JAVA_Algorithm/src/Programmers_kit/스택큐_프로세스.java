package Programmers_kit;

import java.util.*;


public class 스택큐_프로세스 { // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    public static void main(String args[]){

       int[] priorities = {2, 1, 3, 2}; // 1 ~ 9
       int location = 2; // 궁금한 idx -> 3
       
       Solution10 sol = new Solution10();
       System.out.println(sol.solution(priorities, location));

    }
}


class Solution10 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> q = new LinkedList<>();
        // 꺼낸 값보다 우선수위가 높은 값이 있으면 다시 큐 뒤에 넣고 순서가 밀림

        int i = 0;
        for(int pri : priorities){
            q.add(new int[] {i, pri}); // 우선순위, 값
            i++;
        }

        int cnt = 0;

        while(!q.isEmpty()){
            int max = q.peek()[1];
            boolean isPass = true;

            for(int[] tmpq : q) {
                if(max < tmpq[1]){
                    q.add(q.poll()); // 꺼낸 값보다 우선수위가 높은 값이 있으면 다시 큐 뒤에 넣음
                    isPass = false;
                    break;
                }
            }
            if(isPass){
                if(q.peek()[0] == location)
                    return (cnt + 1);
                else
                    q.poll();
                cnt++;
            }
        }
        return answer;
    }
}