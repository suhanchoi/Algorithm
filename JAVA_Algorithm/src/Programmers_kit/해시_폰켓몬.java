package Programmers_kit;

import java.util.*;

public class �ؽ�_���ϸ� { // https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
        int result = ���ϸ�1.solution(nums); // 2;

    }
}

class ���ϸ�1 {
    public static int solution(int[] nums) {
        
    	int answer = 0;
        
        // �ִ��� ���� ������ ���ϸ��� ������
        // ���ϸ� ���� ��ȣ�� ������ return

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.contains(1);
        set.remove(1);

        Iterator<Integer> it = set.iterator();
        it.hasNext();
        it.next();
    	
    	int n = nums.length / 2;
    	
    	Arrays.sort(nums); // nums �迭 

    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i = 0; i < nums.length ; i++) {
    		
    		if(!map.containsKey(nums[i])) {
    			map.put(nums[i], 1);
    		}
    	}
        
    	// ���� ������ �����ϴ� �� ���Ѻ��� ������ , �ִ� �������� �����ϴ� ���� �ִ�
        if(map.size() > n){ 
            answer = n;
        } else {
            answer = map.size();
        }
        
    	return answer;
    }
}