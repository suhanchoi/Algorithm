package Programmers_kit;

import java.util.*;

// dfs / bfs
class dbfs_��Ʈ��ũ { // https://school.programmers.co.kr/learn/courses/30/lessons/43165
    public static void main(String args[]){

    	int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        //int return = 2;
        
        System.out.println(��Ʈ��ũ.solution(n, computers));
    }
}

class ��Ʈ��ũ {
	
	static boolean[] visited;
	
    public static int solution(int n, int[][] computers) {
    	
        int answer = 0;
        
        // ����Ǿ������� �ϳ��� ��Ʈ��ũ�� ��
        // ��Ʈ��ũ�� ������ ��ȯ
        
        visited = new boolean[n+1];
        
        for(int i = 0 ; i < n ; i++) {
        	if(!visited[i+1]) { // ���� �ȵ�ȴٸ�
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
    			
    			if(!visited[i+1] && computers[now][i] == 1) { // �湮���̰� ����Ǿ��ִٸ�
    				visited[i+1] = true; // �湮ó��
    				q.offer(i); // ��ο� �߰�
    			}
    		}
    	}
    }
}


































