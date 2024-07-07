package Programmers_kit;

import java.util.*;

public class 힙_이중우선순위큐 { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}; // [0,0]
				
		//{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        // [333, -45]
        
        // {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"}; // [0,0] 
        System.out.println(Arrays.toString(이중우선순위큐.solution(operations)));
    }
}

class 이중우선순위큐 {
	 public static int[] solution(String[] operations) {
	        int[] answer = new int[2];

			// 우선순위 큐 활용
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // 작은순

		 	// 역순 큰 -> 작은
			PriorityQueue<Integer> reveredPq = new PriorityQueue<Integer>(Collections.reverseOrder());

	        for(String str : operations){
	        	
	            String[] ary = str.split(" ");
	            
	            if(ary[0].equals("I")){ // 삽입로직
	                pq.add(Integer.parseInt(ary[1]));
					reveredPq.add(Integer.parseInt(ary[1]));

	            } else { // "D" 삭제로직

					if(!pq.isEmpty() && !reveredPq.isEmpty()){ // 비어있지 않다면
	            		if(Integer.parseInt(ary[1]) == 1){ // 최댓값 삭제
		                    int max = reveredPq.poll(); // remove 함수는 해당 값 삭제
							pq.remove(max);
		                } else { // 최소값 삭제
		                    int min = pq.poll();
							reveredPq.remove(min);
		                }
	            	}
	            }
	        }
	        
	        System.out.println(pq.toString());
		 	System.out.println(reveredPq.toString());
	        
	        if(!pq.isEmpty() && !reveredPq.isEmpty()){
	            answer[0] = reveredPq.peek(); // 최솟값 반환 및 데이터 삭제
	            answer[1] = pq.peek();

	        } else {
	        	answer[0] = 0;
	            answer[1] = 0;
	        }
	        
	        return answer;
	    }
}