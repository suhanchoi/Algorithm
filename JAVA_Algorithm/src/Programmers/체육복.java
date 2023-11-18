package Programmers;

import java.util.*;

// 탐욕법 그리디
class 체육복 { // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public static void main(String args[]){

    	int n = 3; // 전체 수
    	int[] lost = { 3 }; // 잃어버린 학생 
    	int[] reserve = {1};  // 여분이 있는 학생
    	
    	
    	// return = 5 체육수업을 들을 수 있는 학생
    	
    	System.out.println(체육복1.solution(n, lost, reserve));
    }
}

class 체육복1 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        boolean[] reserveAry =  new boolean [n+1]; // n+2 index 경계값
        // true 이라면 여분의 체육복 있음
        
        for(int j : reserve) {
        	reserveAry[j] = true;
		}
        
        boolean ary[] = new boolean [n+1];
        // true면 잃어버린거 false면 가지고 있는거
        // 여분이 있더라도 도난을 당할 수 있음 -> false

        for(int i : lost) {
        	
        	if(reserveAry[i] == true)
        		ary[i] = false; // 잃어버렸지만 여분이 있으므로 false
        	else
        		ary[i] = true;
        	
        	reserveAry[i] = false; // 여분이 있더라도 도난을 당할 수 있음
        }

        for(int i = 1; i < n +1 ; i++) {
        	
        	if(ary[i] == true) { // 잃어버렸다면
        		
        		if(reserveAry[i-1] == true) {
        			reserveAry[i-1] = false; // 빌려주므로 false 로 업데이트
        			ary[i] = false;
        			
        		} else if (i != n && reserveAry[i+1] == true){
        			reserveAry[i+1] = false; // 빌려주므로 false 로 업데이트
        			ary[i] = false;
        		}
        	}
        }
        
        for(int i = 1; i < n +1 ; i++) {
        	if(ary[i] == false)
        		answer++;
        }
        
        return answer;
    }
}