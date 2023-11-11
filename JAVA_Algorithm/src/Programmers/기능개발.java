package Programmers;

import java.util.*;

public class 기능개발 { // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    public static void main(String args[]){

       int[] progresses = {93, 30, 55};
       int[] speeds = {1, 30, 5};

    }
}


class Solution9 {
    public int[] solution(int[] progresses, int[] speeds) {


        List<Integer> re = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for(int i : progresses){
            q.add(i);
        }

        while(true){
            int cnt = 0;

            if(q.isEmpty()) break;

            Queue<Integer>  tmpQ = new LinkedList<>();

            cnt = q.size();

            for(int i = 0; i < cnt; i++){
                tmpQ.add(q.poll() + speeds[i]);
            }

            cnt = 0;

            while(tmpQ.peek() > 100){
                tmpQ.poll();

                cnt += 1;

                if(tmpQ.isEmpty()) break;

                int[] tmpS = new int[speeds.length - 1];

                for(int j = 1; j < speeds.length; j++){
                    tmpS[j-1] = speeds[j];
                }
                speeds = tmpS;

            }

            if(cnt != 0){
                re.add(cnt);
            }

            q = tmpQ;

        }

        int[] answer = new int[re.size()];

        int k = 0;
        for(int i : re){
            answer[k] = i;
            k++;
        }

        return answer;
    }
}
