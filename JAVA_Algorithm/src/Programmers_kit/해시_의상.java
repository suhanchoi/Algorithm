package Programmers_kit;

import java.util.HashMap;
import java.util.Map;

public class �ؽ�_�ǻ� { public static void main(String args[]){ // https://school.programmers.co.kr/learn/courses/30/lessons/42578
        String[][] clothes = {{"yellow_hat", "headgear"}, 
			        		{"blue_sunglasses", "eyewear"}, 
			        		{"green_turban", "headgear"}};
        
        Solution8 sol = new Solution8();
        System.out.println(sol.solution(clothes));
        
    }
}

class Solution8 {
    public int solution(String[][] clothes) {
        int answer = 0;
        // ������ �Ѱ��� ��쿡��
        // �� ���� ������ ��� ����
        // *= ������ �׸񰹼� +1 ���� ���ξ����� ��� ���� -1

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) +1);
        }

        answer = 1;

        if(map.size() == 1) // ������ 1���� �ۿ� ������ ���� ���� ��ȯ
        	return map.get(clothes[0][1]);

        for(int cnt : map.values()){
            answer *= cnt +1;
        }

        answer -= 1;

        return answer;
    }
}