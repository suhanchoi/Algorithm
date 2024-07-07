package Programmers_kit;

import java.util.*;

public class 완탐_모의고사 { // https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public static void main(String args[]){

        int[] answers = new int[]{1, 2, 3, 4, 5}; // ->s {1}
        //  = new int[]{1, 3, 2, 4, 2} -> {1,2,3}
        
        System.out.println(Solution20.solution(answers));

    }
}

class Solution20 {

    public static int[] solution(int[] answers) {
    	 int[] answer = {};
         
    	 
    	 // 찍는 방식의 패턴
         int[] way1 = {1, 2, 3, 4, 5};
         int[] way2 = {2, 1, 2, 3, 2, 4, 2, 5};
         int[] way3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
         
         int cnt1 = 0;
         int cnt2 = 0;
         int cnt3 = 0;
         
         for(int i = 0; i < answers.length; i ++){
             
             int a = answers[i];
             
             if(a == way1[i % way1.length])
                 cnt1++;
             if(a == way2[i % way2.length])
                 cnt2++;
             if(a == way3[i % way3.length])
                 cnt3++;
         }
         
         System.out.println(cnt1+ " " + cnt2 + " " + cnt3);
         
         int maxCnt = Math.max(cnt1, cnt2);
         maxCnt = Math.max(maxCnt, cnt3);
         
         List<Integer> list = new ArrayList<>();
         
         if(cnt1 == maxCnt)
             list.add(1);
         
         if(cnt2 == maxCnt)
             list.add(2);
         
         if(cnt3 == maxCnt)
             list.add(3);
         
         answer = new int[list.size()];
         
         for(int i = 0; i< list.size(); i++){
             answer[i] = list.get(i);
         }
         
         Arrays.sort(answer);
         
         return answer;
     }
 }