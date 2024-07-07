package Boj;

import java.util.*;
import java.io.*;

class solvedAc_18110{ // https://www.acmicpc.net/problem/1978
    public static void main(String args[]) throws NumberFormatException, IOException{
    		
    /*
     
      상위 15% 하위 15% 총 30% 절사평균
     
     5 // 난이도 개수
     1
     5
     5
     7
     8
     
     -> 6

     */
    	
    int result = 0;	
    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    List<Integer> list = new ArrayList<>();
    
    for(int i = 0; i < n; i++) {
    	list.add(Integer.parseInt(br.readLine()));
    }
    
    Collections.sort(list);
    
    int cnt = (int)Math.round(list.size() * 0.15);
    
    for(int i = cnt; i < n- cnt; i++) {
    	result += list.get(i);
    }
    
    result = (int)Math.round((double) result / (n-(cnt*2)));
    
    System.out.println(result);
    
    }
    
   
}


