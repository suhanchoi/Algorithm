package Programmers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class 다리를_지나는_트럭 { // https://school.programmers.co.kr/learn/courses/30/lessons/42583
    public static void main(String args[]){

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

    }
}

class Solution11 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int tgCnt = 0; // 다리 지난 트럭 idx

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

            if (isRemain) { //  트럭이 전부 출발하지 않은경우
                if (!q.isEmpty()) { // 현재 다리위에 있는 경우
                    for (int[] info : q) {
                        wSum += info[0];
                    }
                    if (wSum <= weight) {
                        if (tgCnt == truck_weights.length) { // 모두 출발 했을시
                            isRemain = false;
                        } else {
                            wSum += truck_weights[tgCnt];
                        }
                        if (wSum <= weight && isRemain) {
                            q.add(new int[]{truck_weights[tgCnt], 0});
                            tgCnt++;
                        }
                    }
                } else { // 다리위에 트럭이 없는 경우
                    q.add(new int[]{truck_weights[tgCnt], 0});
                    tgCnt++;
                }
            }

            if(!q.isEmpty()) { // 다리 위에 있는 경우 시간 증가
                for(int[] info : q){
                    info[1] += 1; // 다리 위 트럭들 시간 증가
                }
            }

            if(tgCnt == truck_weights.length && q.isEmpty()){
                break;
            }
        }
        return answer;
    }
}

