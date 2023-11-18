package Programmers;

import java.util.*;

// Ž��� �׸���
class ����Ʈ { // https://school.programmers.co.kr/learn/courses/30/lessons/42885
    public static void main(String args[]){

    	int[] people= {70, 80, 50};
    	int limit = 100; 

    	// return = 3; 
    	
    	System.out.println(����Ʈ1.solution(people, limit));
    }
}

class ����Ʈ1 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        
        // ����Ʈ �ִ� �θ�
        // ����Ʈ�� �ִ��� ���� ����Ͽ� ��� ����
        // ���� ������ ���� ������ ��� + ���� ������ ���� ���
        
        Arrays.sort(people);
        
        int tmpSum = 0;
        
        int minIdx = 0;
        
        for(int i = people.length -1; i >= minIdx; i--) {
        	
        	if(people[i] + people[minIdx] <= limit) { // �θ� Ż��
        		answer++;
        		minIdx++;
        	} else {
        		answer++;
        	}
        	
        	/*//����Ʈ �ִ��ο��� 2������ �� Ǯ��
        	tmpSum += people[i];
        	
        	if(tmpSum > limit) {
        		answer++;
        		tmpSum = people[i];
        		
        		if (i == 0) { // �� ������� ���
            		answer++;
            	}        	
        	
        	} else if(tmpSum == limit) {
        		answer++;
        		tmpSum = 0;
        		
        	} else if (i == 0) { // �� ������� ���
        		answer++;
        	} 
        	*/       	
        }
        
        return answer;
    }
}