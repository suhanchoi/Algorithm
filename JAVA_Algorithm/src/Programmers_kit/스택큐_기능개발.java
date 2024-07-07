package Programmers_kit;

import java.util.*;

public class ����ť_��ɰ��� { // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    public static void main(String args[]){

       int[] progresses = {93, 30, 55};
       int[] speeds = {1, 30, 5};
       
       Solution9 sol = new Solution9();
       
       System.out.println(sol.solution(progresses, speeds));
    }
}

class Solution9 {
    public static int[] solution(int[] progresses, int[] speeds) {
    	
    	int[] answer;

        List<Integer> re = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>(); // progresses

        for(int i : progresses){ 
            q.add(i);
        }

        while(true){
            int cnt = 0;

            if(q.isEmpty()) break;

            Queue<Integer>  tmpQ = new LinkedList<>();

            cnt = q.size();

            for(int i = 0; i < cnt; i++){
                tmpQ.add(q.poll() + speeds[i]); // ����� + �ӵ�
            }

            cnt = 0;

            while(tmpQ.peek() >= 100){ // 100 �̻��� ��� cnt �߰� 
            	
                tmpQ.poll();

                cnt += 1;

                if(tmpQ.isEmpty()) break;

                int[] tmpS = new int[speeds.length - 1];

                for(int j = 1; j < speeds.length; j++){ // �Ϸ�Ȱ� ���� speeds �缳��
                    tmpS[j-1] = speeds[j];
                }
                speeds = tmpS;

            }

            if(cnt != 0){ // 100 �̻��� ��� �ѹ��� cnt �߰�
                re.add(cnt);
            }

            q = tmpQ; // q 100 �̻��ΰ� ���� �� ������

        }

        answer = new int[re.size()];

        int k = 0;
        for(int i : re){
            answer[k] = i;
            System.out.println(i);
            k++;
        }

        return answer;
    }
}
