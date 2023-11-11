package Programmers;

import java.util.*;

public class 카펫 { // https://school.programmers.co.kr/learn/courses/30/lessons/42839
    public static void main(String args[]){

        int brown = 10;  // 8  // 24
        int yellow = 2;  // 1  // 24
        // answer [4, 3] [3,3] [8,6]  가로, 세로

    }
}

class Solution18 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        List<Integer[]> list = new ArrayList<>(); // x, y

        int sum = brown + yellow;

        for(int i = 1; i < sum + 1; i++){

            int col = sum / i;

            if(col < i) continue;

            if((col - 2) * (i - 2) == yellow){
                answer[0] = col;
                answer[1] = i;
                break;
            }
        }


        /* // 약수로 푸는 방법 [18, 6] 인 경우 6,4 X -> 8, 3 이어야함
        while(true){
            if( i > sum / 2) // 반절 이상
                break;

            if(sum % i == 0){
                if((i-2) * (sum / i - 2) == yellow){ // 개수확인
                    list.add(new Integer[]{i, sum / i, i + sum / i});
                }
            }
            i++;
        }

        Collections.sort(list, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] a, Integer[] b){
                return a[2] - b[2]; // 3번쨰 원소를 기준으로 오름차순 정렬
            }
        });

        int max, min;

        max = Math.max(list.get(0)[0], list.get(0)[1]); // 가장 작은거 출력
        min = Math.min(list.get(0)[0], list.get(0)[1]); // 가장 작은거 출력

        answer[0] = max;
        answer[1] = min;

        */
        return answer;
    }
}