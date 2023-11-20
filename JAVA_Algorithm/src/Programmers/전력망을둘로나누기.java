package Programmers;

import java.util.*;

// bfs, dfs ��Ž
class ���¸����ѷγ����� { // https://school.programmers.co.kr/learn/courses/30/lessons/86971
    public static void main(String args[]){
    	
    	// int n = ����ž�� ����
    	int n = 9;
        int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        
        System.out.println(���¸����ѷγ�����1.solution(n, wires));
    }
}

class ���¸����ѷγ�����1 {
	
	static int[][] ary;
	
    public static int solution(int n, int[][] wires) {
        
    	int answer = n;
        
        // bfs ���ã�� Queue �̿�
        // ���� ����鼭 ����ž ������ ������ �ּҸ� return
        
        // ����� Ʈ��
        ary = new int[n + 1][n + 1]; // 0 ���� ��� �ʱ�ȭ

        for(int i = 0; i < wires.length; i++) {
        	ary[wires[i][0]][wires[i][1]] = 1; 
        	ary[wires[i][1]][wires[i][0]] = 1;
        }
        
        /* // ������� ���
        for(int i = 1; i< ary.length; i++) {
        	for(int j = 0; j < ary[i].length; j++){
        		System.out.print(ary[i][j] + " "); 
        	}
        	System.out.println();
        }
        */
        
        // ������ ������ �ּҰ� ��ȯ
        for(int i = 0; i < wires.length; i++) {
        	int a = wires[i][0];
        	int b = wires[i][1];
        	
        	// ������� ����� ���� ����
        	ary[a][b] = 0;
        	ary[b][a] = 0; 
        	
        	// bfs���� ���� �ּҰ� ����
        	answer = Math.min(answer, bfs(n, a));
        	
        	// ���� ���� ����
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
    		int point = q.poll(); // �������
    		cnt++;
    		
    		for(int i = 1; i <= n; i++) { // �湮���� ��� ���� 1 ~ n
    			if(visited[i] == 1)
    				continue;
    			// i �� ��� �ĺ�
    			// point�� �� ��ġ
    			if(ary[point][i] == 1) { // ����� ������� �ľ�
    				q.offer(i);
    				visited[point] = 1;
        			//cnt++;
    			}
    		}
    	}
    	return (int)Math.abs((2 * cnt) - n); //  cnt - (n - cnt)
    }
}