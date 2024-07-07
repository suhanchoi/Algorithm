package Programmers_kit;

import java.util.*;

// �̺�Ž��
class �̺�Ž��_�Ա��ɻ� { // https://school.programmers.co.kr/learn/courses/30/lessons/43238
    public static void main(String args[]){

        
        int n = 6;
        int[] times = {7, 10};
        //int return = 28;
        
        System.out.println(�Ա��ɻ�1.solution(n, times));
    }
}

class �Ա��ɻ�1 {
	public static long solution(int n, int[] times) {
        long answer = 0;
        
        // �ɻ�޴� �ð��� �ּ�ȭ
        // n ��ٸ��� ��� ��
        // times�� �� �ɻ���� �Ѹ��� �ɻ��ϴµ� �ɸ��� �ð� �迭
        // ������� ���������°��� ���� �ɻ� �ޱⰡ ���� 
        Arrays.sort(times);
        
        // �ð��� �������� max min �̺�Ž�� Ȯ��
        long min = 0, max = (long)n * (long)(times[times.length -1]) , mid;

        while(min <= max) { // Ż���ϰ� �ȴٸ�, �׶��� mid�� ����
        	
        	int sum = 0; // �ɻ��� �ο� -> n�� �Ǹ� ����
        	
        	mid = (min + max) / 2; // mid �ɸ� �ð�
        	
        	for(int i = 0; i < times.length; i++) {
        		sum += mid / times[i]; // �ð��� ���� �ɻ��� �����
        		// �ð��� �ּڰ��� �ɸ��� �ð����� ������
        		// ����� ���� ���� �̺�Ž�� 
        	}
        	
        	if (sum < n) { // �˻縦 �� ���� ���ߴ�. �� �ð��� ������
        		min = mid + 1; // ������ ���� Ž��
        		
        	} else { // �˻縦 �� �ϱ� ������ �� ������ ���� �� �ִ�.
        		// sum == n ���� �� �¾� �������� ���� �� �ֱ� ������ else�� ó��
        		max = mid - 1; // ���� ���� Ž��
        		answer = mid;
        	}
        }
        return answer;
    }
}































