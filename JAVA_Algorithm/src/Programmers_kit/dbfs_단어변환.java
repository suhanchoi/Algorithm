package Programmers_kit;

import java.util.*;

// dfs / bfs
class dbfs_단어변환 { // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public static void main(String args[]){

    	String begin = "hit";
    	String target = "cat";
    	String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        // return = 4;
    	
    	// 1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
    	// 2. words에 있는 단어로만 변환할 수 있습니다.
    	// 변환 할 수 없을땐 0
        
        System.out.println(단어변환.solution(begin, target, words));
    }
}

class 단어변환 {
	
	 static String tar;
	 static String[] word;
	 static int answer;
	 static boolean[] visited ;
	
	 public static int solution(String begin, String target, String[] words) {
	        
	        int cnt = 0;
	        
	        answer = Integer.MAX_VALUE; 
	        
	        tar = target;
	        
	        word = words;
	        
	        visited = new boolean[word.length];
	        
	        dfs(begin, cnt);
	        
	        if(answer == Integer.MAX_VALUE) {
	        	answer = 0;
	        }

	        return answer;
	    }
	 
	 public static void dfs(String str, int cnt) {
		 
		 if(str.equals(tar)) {
			 answer = cnt;
			 return;
		 }
		 
		 if(answer <= cnt) { // 백트래킹
			 return;
		 }
		 
		 for(int i = 0; i < word.length; i++) { // 단어들 개수만큼 반복 
			 
			 int k = 0;
			 
			 for(int j = 0; j < word[i].length() ; j++) {
				 
				 if(str.charAt(j) != word[i].charAt(j)) {
					 k++;
				 }
			 }
				 
			 if(k == 1) { // 1개만 다를시
				 if(!visited[i]) {
					 visited[i] = true;
					 dfs(word[i], cnt+1);
					 visited[i] = false;
				 }
			 }
		 }
	 }
}
































