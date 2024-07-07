package Programmers_kit;

import java.util.*;

// dfs / bfs
class dbfs_�ܾȯ { // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public static void main(String args[]){

    	String begin = "hit";
    	String target = "cat";
    	String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        // return = 4;
    	
    	// 1. �� ���� �� ���� ���ĺ��� �ٲ� �� �ֽ��ϴ�.
    	// 2. words�� �ִ� �ܾ�θ� ��ȯ�� �� �ֽ��ϴ�.
    	// ��ȯ �� �� ������ 0
        
        System.out.println(�ܾȯ.solution(begin, target, words));
    }
}

class �ܾȯ {
	
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
		 
		 if(answer <= cnt) { // ��Ʈ��ŷ
			 return;
		 }
		 
		 for(int i = 0; i < word.length; i++) { // �ܾ�� ������ŭ �ݺ� 
			 
			 int k = 0;
			 
			 for(int j = 0; j < word[i].length() ; j++) {
				 
				 if(str.charAt(j) != word[i].charAt(j)) {
					 k++;
				 }
			 }
				 
			 if(k == 1) { // 1���� �ٸ���
				 if(!visited[i]) {
					 visited[i] = true;
					 dfs(word[i], cnt+1);
					 visited[i] = false;
				 }
			 }
		 }
	 }
}
































