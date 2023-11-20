package Programmers;

import java.util.*;

// dfs / bfs
class 게임맵최단거리 { // https://school.programmers.co.kr/learn/courses/30/lessons/1844
    public static void main(String args[]){

        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        //int return = 11;
        
        System.out.println(게임맵최단거리1.solution(maps));
    }
}

class 게임맵최단거리1 {
	
	static int[][] cnt;
	
    public static int solution(int[][] maps) {
        int answer = 0;
        
        // 맵을 벗어날순 없음
        // 0은 벽이므로 이동할 수 없음
        // 1은 이동 가능
        // 맨 처음 시작위치는 0,0
        // 도착위치는 n, m
        // 가장 빠른 최단거리를 출력
        // 도착할 수 없다면 return -1
        
        bfs(int[][] maps);
        
        // n,m 의 값 확인
        if(cnt[maps.length -1][maps[0].length -1] == 0) {
        	answer = -1;
        } else  {
        	answer = cnt[maps.length -1][maps[0].length -1];
        }
        
        return answer;
    }
    
    public static void bfs(int[][] maps) {
    	
    	// 이동 후 이동한 부분은 벽 처리 
    	
    	cnt = new int[maps.length][maps[0].length]; // 경로에 이동 횟수 지정
    	
    	cnt[0][0] = 1; // 출발했으므로 거리 1 지정
    	
    	Queue<int[]> q = new LinkedList<>();
    	
    	q.add(new int[] {0,0}); // 시작 위치 지정
    	
    	while(!q.isEmpty()) {
    		
    		int[] now = q.poll();
    		int x = now[0];
    		int y = now[1];
    		
	    	// 상 하 좌 우
	    	int[] dx = {-1, 1, 0, 0}; // 행  
	    	int[] dy = {0, 0, -1, 1}; // 열
	    	
	    	for(int i = 0; i < 4; i++) {
	    		x = x + dx[i];
	    		y = y + dy[i];
	    	}
	    	
	    	// 벽을 넘는지 아닌지
	    	// 이동하려는 칸이 벽인지 확인
	    	// cnt == 0 즉 들리지 않은 곳인 지 확인 후
	    	// 벽이 아니라면 경로에 추가 -> q.add(위치)
	    	
	    	// cnt ++;
	    	// 이동한 타일은 벽 처리
	    	
    	
    	}
    	
    	
    };
    
    
}
































