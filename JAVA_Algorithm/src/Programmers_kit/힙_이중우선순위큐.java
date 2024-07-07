package Programmers_kit;

import java.util.*;

public class ��_���߿켱����ť { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}; // [0,0]
				
		//{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        // [333, -45]
        
        // {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}; // [0,0] 
        System.out.println(Arrays.toString(���߿켱����ť.solution(operations)));
    }
}

class ���߿켱����ť {
	 public static int[] solution(String[] operations) {
	        int[] answer = new int[2];

			// �켱���� ť Ȱ��
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // ������

		 	// ���� ū -> ����
			PriorityQueue<Integer> reveredPq = new PriorityQueue<Integer>(Collections.reverseOrder());

	        for(String str : operations){
	        	
	            String[] ary = str.split(" ");
	            
	            if(ary[0].equals("I")){ // ���Է���
	                pq.add(Integer.parseInt(ary[1]));
					reveredPq.add(Integer.parseInt(ary[1]));

	            } else { // "D" ��������

					if(!pq.isEmpty() && !reveredPq.isEmpty()){ // ������� �ʴٸ�
	            		if(Integer.parseInt(ary[1]) == 1){ // �ִ� ����
		                    int max = reveredPq.poll(); // remove �Լ��� �ش� �� ����
							pq.remove(max);
		                } else { // �ּҰ� ����
		                    int min = pq.poll();
							reveredPq.remove(min);
		                }
	            	}
	            }
	        }
	        
	        System.out.println(pq.toString());
		 	System.out.println(reveredPq.toString());
	        
	        if(!pq.isEmpty() && !reveredPq.isEmpty()){
	            answer[0] = reveredPq.peek(); // �ּڰ� ��ȯ �� ������ ����
	            answer[1] = pq.peek();

	        } else {
	        	answer[0] = 0;
	            answer[1] = 0;
	        }
	        
	        return answer;
	    }
}