package Programmers_kit;

import java.util.*;

public class ��_����Ʈ�ٹ� { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        String[] genres= {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        // [4 1 3 0]
        
        // �帣�� ���ϵ� �뷡 ���� ����
        // �帣 �� �뷡 2�������� ����
        
        ����Ʈ�ٹ� sol = new ����Ʈ�ٹ�();
        System.out.println(Arrays.toString(sol.solution(genres, plays)));
        
        // hashMap�� �ΰ� �Ἥ �����ؼ� ���� Ǯ���ѵ���


    }
}

class ����Ʈ�ٹ� {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, List<int[]>> map = new HashMap<>();
        
        for(int i = 0; i<genres.length;i++) {
        	
        	if(map.get(genres[i]) != null) { // �����ǰ� �߰�
        		
        		List<int[]> list = map.get(genres[i]);
        		list.add(new int[] {plays[i],i});
        		
        		map.put(genres[i], list);
        	}
        	else {// ó�� ����
        		List<int[]> list = new ArrayList<>();
        		list.add(new int[] {plays[i], i});
        		
        		map.put(genres[i], list);
        	}
        }
        
        /*
        for(List list : map.values()) {
        	list.
        }
        */
        System.out.println(map.toString());
        
        
        
        
        
        
        return answer;
    }
}