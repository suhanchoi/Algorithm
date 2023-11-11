package Programmers;

import java.util.*;



public class 주식가격 { // https://school.programmers.co.kr/learn/courses/30/lessons/42584
    public static void main(String args[]){

        int[] prices = {1, 2, 3, 2, 3};

    }
}

class Solution12 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack();

        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peek()]) {
                answer[st.peek()] = i - st.peek();
                st.pop(); // 답을 구했기 때문에 stack에서 제거한다
            }
            st.push(i);
        }

        while (!st.isEmpty()) { // 값을 구하지 못한 index == 끝까지 가격이 떨어지지 않은 주식
            answer[st.peek()] = prices.length - st.peek() - 1;
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