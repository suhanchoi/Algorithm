package Programmers;

import java.util.*;

// bfs, dfs 완탐
class 전력망을둘로나누기 { // https://school.programmers.co.kr/learn/courses/30/lessons/86971
    public static void main(String args[]){
    	
    	// int n = 송전탑의 개수
    	int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        
        System.out.println(전력망을둘로나누기1.solution(n, wires));
    }
}

class 전력망을둘로나누기1 {
	
	static int[][] ary;
	
    public static int solution(int n, int[][] wires) {
        
    	int answer = n;
        
        // bfs 경로찾기 Queue 이용
        // 선을 끊어보면서 송전탑 개수의 차이의 최소를 return
        
        // 양방향 트리
        ary = new int[n + 1][n + 1]; // 0 으로 모두 초기화

        for(int i = 0; i < wires.length; i++) {
        	ary[wires[i][0]][wires[i][1]] = 1; 
        	ary[wires[i][1]][wires[i][0]] = 1;
        }
        
        /* // 인접행렬 출력
        for(int i = 1; i< ary.length; i++) {
        	for(int j = 0; j < ary[i].length; j++){
        		System.out.print(ary[i][j] + " "); 
        	}
        	System.out.println();
        }
        */
        
        // 연결을 끊으며 최소값 반환
        for(int i = 0; i < wires.length; i++) {
        	int a = wires[i][0];
        	int b = wires[i][1];
        	
        	// 인접행렬 양방향 연결 끊기
        	ary[a][b] = 0;
        	ary[b][a] = 0; 
        	
        	// bfs으로 차이 최소값 설정
        	answer = Math.min(answer, bfs(n, a));
        	
        	// 끊긴 연결 복구
        	ary[a][b] = 1;
        	ary[b][a] = 1; 
        }
        return answer;
    }
    
    public static int bfs(int n , int start) {
    	
    	int cnt = 0; 
    	int[] visited = new int[n+1];
    	
    	Queue<Integer> q = new LinkedList<>();
    	q.offer(start); // q.offer(start);
    	//int cnt = 1;
    	
    	while(!q.isEmpty()) {
    		int point = q.poll(); // 경로지정
    		cnt++;
    		
    		for(int i = 1; i <= n; i++) { // 방문안한 경로 지정 1 ~ n
    			if(visited[i] == 1)
    				continue;
    			// i 는 경로 후보
    			// point는 현 위치
    			if(ary[point][i] == 1) { // 연결된 경로인지 파악
    				q.offer(i);
    				visited[point] = 1;
        			//cnt++;
    			}
    		}
    	}
    	return (int)Math.abs((2 * cnt) - n); //  cnt - (n - cnt)
    }
}