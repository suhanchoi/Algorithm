package Programmers;

import java.util.*;

// ����Ž�� ���Ʈ����
class �Ҽ�ã�� { // https://school.programmers.co.kr/learn/courses/30/lessons/42839?language=java
    public static void main(String args[]){

        String numbers = "17";
        //int return = 3; // "7" "17" "71"
        
        System.out.println(�Ҽ�ã��1.solution(numbers));
    }
}

class �Ҽ�ã��1 {
	
	static HashSet<Integer> set = new HashSet<>();
	
    public static int solution(String numbers) { // �����佺�׳׽��� ü
    	//  https://www.youtube.com/watch?v=pF368QqdQb4&list=PLlV7zJmoG4XI9VguUVNMu3pCjssb4aR_0&index=3&ab_channel=%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%A1%9C%EC%B7%A8%EC%A7%81%ED%95%98%EA%B8%B0 ����
        
    	int answer = 0;
        
        // ��� ���ڵ��� ���տ��� �Ҽ��� ������ ��ȯ
    	// ���� ������ ��� ���� ������ ����Լ��� ����
    	// set���� �ߺ� ���� ����
    	// �Ҽ� �Ǵ��� �����佺�׳׽��� ü Ȱ��
    	// -> �ش� ������ ������ ������ �������� �ľ��ϸ� �Ҽ����� �Ǵ� ����
    	
    	recursive("", numbers); // ����Լ��� ���հ����� ���� ����
    	
        Iterator<Integer> it = set.iterator();
        
        while(it.hasNext()) {
        	int num = it.next();
        	if(isPrime(num))
        		answer++;
        			
        }

        return answer;
    }
    
    // ��ͷ� ���� ���� ���� 
    public static void recursive(String comb, String others) {
    	if(!"".equals(comb)) {
    		set.add(Integer.parseInt(comb));
    	}
    	
    	for(int i = 0; i < others.length(); i++) {
    		// i �ְ�, ������ �߰� �� ���ȣ��
    		recursive(comb + others.charAt(i) , others.substring(0, i) + others.substring(i+1));
    	}
    }
    
    // �Ҽ��Ǻ�
    // �����佺�׳׽��� ü Ȱ��
    public static boolean isPrime(int num) { 
    	
    	if(num == 0 || num ==1) {
    		return false;
    	}
    	
    	int lim = (int)Math.sqrt(num); // limit ����
    	
    	for(int i = 2; i <=lim; i++) { // i�� 2���� <= lim �Ѱ����
    		if(num % i == 0) { // ������ �Ǹ� �Ҽ��� �ƴ�
    			return false;
    		}
    	}
    	return true;
    }
}





































