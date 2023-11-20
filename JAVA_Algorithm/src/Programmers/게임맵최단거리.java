package Programmers;

import java.util.*;

// dfs / bfs
class ���Ӹ��ִܰŸ� { // https://school.programmers.co.kr/learn/courses/30/lessons/1844
    public static void main(String args[]){

        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        //int return = 11;
        
        System.out.println(���Ӹ��ִܰŸ�1.solution(maps));
    }
}

class ���Ӹ��ִܰŸ�1 {
	
	static int[][] cnt;
	
    public static int solution(int[][] maps) {
        int answer = 0;
        
        // ���� ����� ����
        // 0�� ���̹Ƿ� �̵��� �� ����
        // 1�� �̵� ����
        // �� ó�� ������ġ�� 0,0
        // ������ġ�� n, m
        // ���� ���� �ִܰŸ��� ���
        // ������ �� ���ٸ� return -1
        
        bfs(int[][] maps);
        
        // n,m �� �� Ȯ��
        if(cnt[maps.length -1][maps[0].length -1] == 0) {
        	answer = -1;
        } else  {
        	answer = cnt[maps.length -1][maps[0].length -1];
        }
        
        return answer;
    }
    
    public static void bfs(int[][] maps) {
    	
    	// �̵� �� �̵��� �κ��� �� ó�� 
    	
    	cnt = new int[maps.length][maps[0].length]; // ��ο� �̵� Ƚ�� ����
    	
    	cnt[0][0] = 1; // ��������Ƿ� �Ÿ� 1 ����
    	
    	Queue<int[]> q = new LinkedList<>();
    	
    	q.add(new int[] {0,0}); // ���� ��ġ ����
    	
    	while(!q.isEmpty()) {
    		
    		int[] now = q.poll();
    		int x = now[0];
    		int y = now[1];
    		
	    	// �� �� �� ��
	    	int[] dx = {-1, 1, 0, 0}; // ��  
	    	int[] dy = {0, 0, -1, 1}; // ��
	    	
	    	for(int i = 0; i < 4; i++) {
	    		x = x + dx[i];
	    		y = y + dy[i];
	    	}
	    	
	    	// ���� �Ѵ��� �ƴ���
	    	// �̵��Ϸ��� ĭ�� ������ Ȯ��
	    	// cnt == 0 �� �鸮�� ���� ���� �� Ȯ�� ��
	    	// ���� �ƴ϶�� ��ο� �߰� -> q.add(��ġ)
	    	
	    	// cnt ++;
	    	// �̵��� Ÿ���� �� ó��
	    	
    	
    	}
    	
    	
    };
    
    
}
































