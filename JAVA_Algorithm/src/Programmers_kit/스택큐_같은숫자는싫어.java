package Programmers_kit;

import java.util.*;



public class ����ť_�������ڴ½Ⱦ� { // https://school.programmers.co.kr/learn/courses/30/lessons/12906
    public static void main(String args[]){

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        // ���ӵ� ���� �����ؾ���
        // ť�� ��ɱ���

    }
}

class Solution13 {
    public int[] solution(int []arr) {
        int[] answer = {};

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length ; i++){
            if(q.size() < 1){
                q.add(arr[i]);
                continue;
            }
            if((arr[i] != arr[i-1])){
                q.add(arr[i]);
            }
        }

        Iterator<Integer> it = q.iterator();

        answer = new int[q.size()];
        // ť�� �迭�� ��ȯ

        int i = 0;
        while(it.hasNext()){
            answer[i] = it.next();
            i++;
        }

        return answer;
    }
}