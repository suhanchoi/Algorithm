package Programmers_kit;

import java.util.*;

public class ��_��ũ��Ʈ�ѷ� { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        
        // ��û�Ƚð�, �ҿ�ð�
				
        System.out.println(��ũ��Ʈ�ѷ�.solution(jobs));
    }
}

class ��ũ��Ʈ�ѷ�{
    public static int solution(int[][] jobs) {
        int answer = 0;
        
        // ������ �ð��� �������� �����ϰ�
        // ó���ؾ���
        // ȸ�ǽ� ������ ����
      
        // �� �۾��� ��û���� ������� �ɸ� �ð��� ���
        
        // ��û�� �ð��� �������� ���� ����, ��������
        // �ҿ�Ǵ� �ð��� �������� ���� ����, ��������
        
        // -> pq �� ���Ͱ��� �켱������ ����

        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        
        // (o1, o2) -> o1[0] - o2[0];
        // -> Comparator compare �� ������������ ǥ��
        
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); // ��û�� �ð� �������� ���� ��������
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // �ҿ�ð� ª�� ������ ��������
        
        int cnt = 0; // ó������
        int idx = 0; // ó�� �ε���
        
        int sum = 0; // �ð� ����
        int end = 0; // �� �۾� �Ϸ����

        while(cnt < jobs.length) {
        	
        	// ������ ���� �ʾҰ�, ���� ���� ���� ���۽ð��� �ִ°͵� pq �� �߰�
        	while(idx < jobs.length && jobs[idx][0] <= end) {
        		pq.add(jobs[idx++]);
        	}
        	
        	if(pq.isEmpty()) { // �۾� ����� ���ٸ�
        		end = jobs[idx][0]; // ���ο� ��û�� �������� ����
        	} else { // �۾� ����� �ִٸ�
        		int[] temp = pq.poll();
        		
        		sum += temp[1] + end - temp[0]; // �ҿ�ð� ���� ���
        		end += temp[1]; // �ҿ�ð� ������Ʈ
        		cnt++; // ó������ ������Ʈ
        	}
        }

        return sum / jobs.length;
    }
}