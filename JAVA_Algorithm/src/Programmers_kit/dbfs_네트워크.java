package Programmers_kit;

import java.util.*;

// dfs / bfs
class dbfs_네트워크 { // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public static void main(String args[]){

    	int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        //int return = 2;
        
        System.out.println(네트워크.solution(n, computers));
    }
}

class 네트워크 {
	
	static boolean[] visited;
	
    public static int solution(int n, int[][] computers) {
    	
        int answer = 0;
        
        // 연결되어있으면 하나의 네트워크로 봄
        // 네트워크의 개수를 반환
        
        visited = new boolean[n+1];
        
        for(int i = 0 ; i < n ; i++) {
        	if(!visited[i+1]) { // 아직 안들렸다면
        		bfs(i, computers);
        		answer++;
        	}
        }
        
        return answer;
    }
    
    public static void bfs(int start , int[][] computers) {
    	
    	Queue<Integer> q = new LinkedList<>();
    	
    	q.offer(start);
    	
    	while(!q.isEmpty()) {
    		
    		int now = q.poll();
    		
    		for(int i = 0; i < computers.length; i++) {
    			
    			if(!visited[i+1] && computers[now][i] == 1) { // 방문전이고 연결되어있다면
    				visited[i+1] = true; // 방문처리
    				q.offer(i); // 경로에 추가
    			}
    		}
    	}
    }
}


































