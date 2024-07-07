package Programmers_kit;

import java.util.*;

// dfs 활용
public class 완탐_피로도 { // https://school.programmers.co.kr/learn/courses/30/lessons/87946
    public static void main(String args[]){

        int k = 80;
        int[][] dungeons = new int[][]{{80,20}, {50,40}, {30,10}}; 
        // 최소필요피로도, 소모 피로도
        
        System.out.println(Solution19.solution(k, dungeons)); 
    }
}

class Solution19 {

    static int answer;
    static boolean[] visited;

    public static int solution(int k, int[][] dungeons) {

        answer = -1;
        visited = new boolean[dungeons.length];

        DFS(0, k, dungeons);

        return answer;
    }

    public static void DFS(int depth, int k, int[][] dungeons) {

        for (int i = 0; i < dungeons.length; i++) {

            if (visited[i] == true || k < dungeons[i][0])
                continue;

            visited[i] = true;
            DFS(depth + 1, k - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);

    }
}




