package Programmers;

import java.util.*;

// Ž��� �׸���
class ü���� { // https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public static void main(String args[]){

    	int n = 3; // ��ü ��
    	int[] lost = { 3 }; // �Ҿ���� �л� 
    	int[] reserve = {1};  // ������ �ִ� �л�
    	
    	
    	// return = 5 ü�������� ���� �� �ִ� �л�
    	
    	System.out.println(ü����1.solution(n, lost, reserve));
    }
}

class ü����1 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        boolean[] reserveAry =  new boolean [n+1]; // n+2 index ��谪
        // true �̶�� ������ ü���� ����
        
        for(int j : reserve) {
        	reserveAry[j] = true;
		}
        
        boolean ary[] = new boolean [n+1];
        // true�� �Ҿ������ false�� ������ �ִ°�
        // ������ �ִ��� ������ ���� �� ���� -> false

        for(int i : lost) {
        	
        	if(reserveAry[i] == true)
        		ary[i] = false; // �Ҿ�������� ������ �����Ƿ� false
        	else
        		ary[i] = true;
        	
        	reserveAry[i] = false; // ������ �ִ��� ������ ���� �� ����
        }

        for(int i = 1; i < n +1 ; i++) {
        	
        	if(ary[i] == true) { // �Ҿ���ȴٸ�
        		
        		if(reserveAry[i-1] == true) {
        			reserveAry[i-1] = false; // �����ֹǷ� false �� ������Ʈ
        			ary[i] = false;
        			
        		} else if (i != n && reserveAry[i+1] == true){
        			reserveAry[i+1] = false; // �����ֹǷ� false �� ������Ʈ
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