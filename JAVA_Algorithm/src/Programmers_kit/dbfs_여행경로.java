package Programmers_kit;

import java.util.*;

// dfs / bfs
class dbfs_������ { // https://school.programmers.co.kr/learn/courses/30/lessons/43164
    public static void main(String args[]){

        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}}; 
        	//{{"HND", "IAD"}, {"ICN", "JFK"}, {"JFK", "HND"}}; // {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        // String[] return = ["ICN", "JFK", "HND", "IAD"]
        // ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
        
        System.out.println(Arrays.toString(������.solution(tickets)));
    }
}

class ������ {
	
	static String[][] ticket;
	static List<String> list = new LinkedList<>();
	static boolean[] visited;
	
    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        
        ticket = tickets;
        
        visited = new boolean[tickets.length];
        
        int cnt = 0;
        
        dfs("ICN", "ICN", cnt); // ����� ICN ���� ����
        
        Collections.sort(list); // ��� ����� ���߿��� ������ ����
        
        answer = list.get(0).split(" "); // ������ ���� �Ҵ�
        
        return answer;
    }
    
    
    public static void dfs(String str, String route, int cnt) {
    	
    	if(cnt == ticket.length) {
    		list.add(route);
    		return;
    	}
    	
    	for(int i = 0 ; i < ticket.length; i++) {
    		if(!visited[i] && ticket[i][0].equals(str)) { // �ȵ�Ȱ� �� �������� �� ������� ���ٸ� 
    			visited[i] = true;
    			dfs(ticket[i][1], route + " " + ticket[i][1], cnt + 1);
    			visited[i] = false;
    		}
    	}
    }
}

































