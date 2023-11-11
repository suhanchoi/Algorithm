package Programmers;

import java.util.*;


public class 프로세스 { // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    public static void main(String args[]){

       int[] priorities = {2, 1, 3, 2};
       int location = 2;

    }
}


class Solution10 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<int[]> q = new LinkedList<>();

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
                    q.add(q.poll());
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