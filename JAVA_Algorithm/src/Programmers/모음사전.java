package Programmers;

import java.util.*;

// ����Ž�� ���Ʈ����
// ���
class �������� { // https://school.programmers.co.kr/learn/courses/30/lessons/84512
    public static void main(String args[]){

        String word = "AAAAE";
        //int return = 6;
        
        System.out.println(��������1.solution(word));
        

    }
}

class ��������1 {
    
	static String[] ary;
	static ArrayList<String> list = new ArrayList<>();
	
	public static int solution(String word) {
        int answer = 0;
        
        // ��ͷ� "A E I O U" �������� �̷���� �ܾ ��� �����
        // ������ ������ ����, ������ ������ ����
        // �ش� �ܾ ���������� ���°���� return
        
        ary = new String[]{"A", "E", "I", "O", "U"}; // �����ÿ� new ��ü �ʱ�ȭ
        
        recursive("", 0);
        
        for(int i = 0; i < list.size(); i++) { // �������̹Ƿ� ����Ž��
        	
        	System.out.println("i : " + list.get(i));
        	
        	
        	if(word.equals(list.get(i))) { 
        		answer =  i;
        		//return answer;
        	}
        }
        
        return answer;
    }
	
	public static void recursive(String str, int depth) { // depth Ȱ��
		
		list.add(str);
		
		if(depth == 5) {
			return;
		}
		
		for(int i = 0; i < ary.length; i++) { 
			recursive(str + ary[i], depth +1);
		}
	}
}