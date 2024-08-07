package Programmers_kit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class ?€λ¦¬λ??_μ§???_?Έ?­ { // https://school.programmers.co.kr/learn/courses/30/lessons/42583
    public static void main(String args[]){

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

    }
}

class Solution11 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int tgCnt = 0; // ?€λ¦? μ§?? ?Έ?­ idx

        Queue<int[]> q = new LinkedList<>();
        boolean isRemain = true;

        while(true){

            answer++;

            if(!q.isEmpty()){
                Iterator<int[]> it = q.iterator();
                while(it.hasNext()){
                    if(it.next()[1] == bridge_length){
                        it.remove();
                    }
                }
            }

            int wSum = 0;

            if (isRemain) { //  ?Έ?­?΄ ? λΆ? μΆλ°?μ§? ???κ²½μ°
                if (!q.isEmpty()) { // ??¬ ?€λ¦¬μ? ?? κ²½μ°
                    for (int[] info : q) {
                        wSum += info[0];
                    }
                    if (wSum <= weight) {
                        if (tgCnt == truck_weights.length) { // λͺ¨λ μΆλ° ???
                            isRemain = false;
                        } else {
                            wSum += truck_weights[tgCnt];
                        }
                        if (wSum <= weight && isRemain) {
                            q.add(new int[]{truck_weights[tgCnt], 0});
                            tgCnt++;
                        }
                    }
                } else { // ?€λ¦¬μ? ?Έ?­?΄ ?? κ²½μ°
                    q.add(new int[]{truck_weights[tgCnt], 0});
                    tgCnt++;
                }
            }

            if(!q.isEmpty()) { // ?€λ¦? ?? ?? κ²½μ° ?κ°? μ¦κ?
                for(int[] info : q){
                    info[1] += 1; // ?€λ¦? ? ?Έ?­?€ ?κ°? μ¦κ?
                }
            }

            if(tgCnt == truck_weights.length && q.isEmpty()){
                break;
            }
        }
        return answer;
    }
}

