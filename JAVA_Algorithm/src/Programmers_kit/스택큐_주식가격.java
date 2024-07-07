package Programmers_kit;

import java.util.*;



public class ����ť_�ֽİ��� { // https://school.programmers.co.kr/learn/courses/30/lessons/42584
    public static void main(String args[]){

        int[] prices = {1, 2, 3, 2, 3};
        
        System.out.println(Arrays.toString(new Solution12().solution(prices)));

    }
}

class Solution12 {
    public int[] solution(int[] prices) {
    	
        int[] answer = new int[prices.length];
        
        Stack<Integer> st = new Stack();

        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peek()]) { // ������ �������ٸ�
                answer[st.peek()] = i - st.peek(); // ������ �ð� �Ҵ�
                st.pop(); // ���� ���߱� ������ stack���� �����Ѵ�
            }
            st.push(i);
            System.out.println(i + " : ");
            System.out.println(st);
            System.out.println(Arrays.toString(answer)+ "\n");
        }

        while (!st.isEmpty()) { // ���� ������ ���� index == ������ ������ �������� ���� �ֽ�
            answer[st.peek()] = prices.length - st.peek() - 1; // st�� �ִ� �ð���� �� �Ҵ�
            st.pop();
        }

        return answer;
    }

        /*
        for(int i = 0; i < answer.length; i++){
            answer[i] = 0;
        }

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < answer.length; i++){
            if(st.isEmpty()){
                st.push(prices[i]);
            } else {
                if(st.peek() > prices[i]){
                    st.pop();
                }
            }

            for(int j = 0; j < st.peek(); j++){
                answer[j]++;
            }
        }
        return answer;
        */

}