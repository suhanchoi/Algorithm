package Programmers_kit;

import java.util.*;

public class 정렬_k번째수 { // https://school.programmers.co.kr/learn/courses/30/lessons/42746
    public static void main(String args[]){

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        System.out.println(Arrays.toString(Solution26.solution(array, commands)));
        // [5, 6, 3]
        
    }
}

class Solution26 {
	public static int[] solution(int[] array, int[][] commands) {
        
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			
			int start = commands[i][0];
			int end = commands[i][1];
			
			List<Integer> list = new ArrayList<>();
			
			for(int j = start; j < end + 1; j++) {
				list.add(array[j-1]);
			}
			
			Collections.sort(list);
			
			answer[i] = list.get(commands[i][2] - 1);
		}
		
        /*
        for(int i = 0; i < commands.length; i++){ // 2차원 배열의 행 개수만큼 선언
            
            int[] temp = new int[commands[i][1] - commands[i][0] +1]; // ???
            
            int k = 0;
            
            for(int j = commands[i][0]; j < commands[i][1] + 1; j++){
                temp[k] = array[j -1];
                k++;
            }
            
            Arrays.sort(temp);
            
            answer[i] = temp[commands[i][2] -1];
        }
        */
        
        return answer;
    }
}