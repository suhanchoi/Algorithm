package Programmers_kit;

import java.util.*;

public class 힙_베스트앨범 { // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    public static void main(String args[]){

        String[] genres= {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        // [4 1 3 0]
        
        // 장르에 포하된 노래 수로 정렬
        // 장르 안 노래 2번까지만 정렬
        
        베스트앨범 sol = new 베스트앨범();
        System.out.println(Arrays.toString(sol.solution(genres, plays)));
        
        // hashMap을 두개 써서 정렬해서 많이 풀이한듯함


    }
}

class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, List<int[]>> map = new HashMap<>();
        
        for(int i = 0; i<genres.length;i++) {
        	
        	if(map.get(genres[i]) != null) { // 생성되고 추가
        		
        		List<int[]> list = map.get(genres[i]);
        		list.add(new int[] {plays[i],i});
        		
        		map.put(genres[i], list);
        	}
        	else {// 처음 생성
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