package Programmers_kit;

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
        
        // -> 시간초과로인해 다른 방법으로 풀어야함
        // visited[][] 추가?
        
        bfs(maps);
        
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
    	
    	int[][]	visited = new int[maps.length][maps[0].length];
    	
    	visited[0][0] = 1; // 방문처리
    	
    	while(!q.isEmpty()) {
    		
    		int[] now = q.poll();
    		
    		// 방문 처리를 여기서 하면 시간이 오래걸림...
    		
    		int x = now[0];
    		int y = now[1];
    		
    		if(x == maps.length -1  && y == maps[0].length -1)
    			break;
    		
    		int newX = 0, newY = 0;
    		
	    	// 상 하 좌 우
	    	int[] dx = {-1, 1, 0, 0}; // 행  maps.length
	    	int[] dy = {0, 0, -1, 1}; // 열  maps[0].length
	    	
	    	for(int i = 0; i < 4; i++) { // 상하좌우로 1칸씩 이동
	    		newX = x + dx[i];
	    		newY = y + dy[i];
	    		
		    	// 벽을 넘는지 아닌지
		    	// 이동하려는 칸이 벽인지 확인
		    	// 벽이 아니라면 경로에 추가 -> q.add(위치)
	    		
		    	if(newX >= 0 && newX <= maps.length -1 && newY >= 0 
		    			&& newY <= maps[0].length -1) {
		    		// map 안에 있는지 확인 후
		    		
		    		if(maps[newX][newY] == 1 && visited[newX][newY] != 1) { // 벽이 아니라 갈 수 있는 길이라면,
		        		visited[newX][newY] = 1; // 방문처리
		    			q.add(new int[] {newX, newY}); // 경로에 추가
		    			cnt[newX][newY] = cnt[x][y] + 1; // 최단거리 업데이트
		    		}
		    	} // if 끝
	    	} // for 끝
	    	
	    	// 이동한 타일은 벽 처리
	    	maps[x][y] = 0; // 방문처리와 같은 개념
    	}
    };
}
























 