package Programmers_kit;

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
        
        // -> �ð��ʰ������� �ٸ� ������� Ǯ�����
        // visited[][] �߰�?
        
        bfs(maps);
        
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
    	
    	int[][]	visited = new int[maps.length][maps[0].length];
    	
    	visited[0][0] = 1; // �湮ó��
    	
    	while(!q.isEmpty()) {
    		
    		int[] now = q.poll();
    		
    		// �湮 ó���� ���⼭ �ϸ� �ð��� �����ɸ�...
    		
    		int x = now[0];
    		int y = now[1];
    		
    		if(x == maps.length -1  && y == maps[0].length -1)
    			break;
    		
    		int newX = 0, newY = 0;
    		
	    	// �� �� �� ��
	    	int[] dx = {-1, 1, 0, 0}; // ��  maps.length
	    	int[] dy = {0, 0, -1, 1}; // ��  maps[0].length
	    	
	    	for(int i = 0; i < 4; i++) { // �����¿�� 1ĭ�� �̵�
	    		newX = x + dx[i];
	    		newY = y + dy[i];
	    		
		    	// ���� �Ѵ��� �ƴ���
		    	// �̵��Ϸ��� ĭ�� ������ Ȯ��
		    	// ���� �ƴ϶�� ��ο� �߰� -> q.add(��ġ)
	    		
		    	if(newX >= 0 && newX <= maps.length -1 && newY >= 0 
		    			&& newY <= maps[0].length -1) {
		    		// map �ȿ� �ִ��� Ȯ�� ��
		    		
		    		if(maps[newX][newY] == 1 && visited[newX][newY] != 1) { // ���� �ƴ϶� �� �� �ִ� ���̶��,
		        		visited[newX][newY] = 1; // �湮ó��
		    			q.add(new int[] {newX, newY}); // ��ο� �߰�
		    			cnt[newX][newY] = cnt[x][y] + 1; // �ִܰŸ� ������Ʈ
		    		}
		    	} // if ��
	    	} // for ��
	    	
	    	// �̵��� Ÿ���� �� ó��
	    	maps[x][y] = 0; // �湮ó���� ���� ����
    	}
    };
}
























 