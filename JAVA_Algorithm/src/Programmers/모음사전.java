package Programmers;

import java.util.*;

// 완전탐색 브루트포스
// 재귀
class 모음사전 { // https://school.programmers.co.kr/learn/courses/30/lessons/84512
    public static void main(String args[]){

        String word = "AAAAE";
        //int return = 6;
        
        System.out.println(모음사전1.solution(word));
        

    }
}

class 모음사전1 {
    
	static String[] ary;
	static ArrayList<String> list = new ArrayList<>();
	
	public static int solution(String word) {
        int answer = 0;
        
        // 재귀로 "A E I O U" 모음으로 이루어진 단어를 모두 만들고
        // 순서가 있으니 순열, 순서가 없으면 조합
        // 해당 단어가 사전순으로 몇번째인지 return
        
        ary = new String[]{"A", "E", "I", "O", "U"}; // 생성시에 new 객체 초기화
        
        recursive("", 0);
        
        for(int i = 0; i < list.size(); i++) { // 사전순이므로 선형탐색
        	
        	System.out.println("i : " + list.get(i));
        	
        	
        	if(word.equals(list.get(i))) { 
        		answer =  i;
        		//return answer;
        	}
        }
        
        return answer;
    }
	
	public static void recursive(String str, int depth) { // depth 활용
		
		list.add(str);
		
		if(depth == 5) {
			return;
		}
		
		for(int i = 0; i < ary.length; i++) { 
			recursive(str + ary[i], depth +1);
		}
	}
}