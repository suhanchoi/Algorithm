package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공원산책 {
    public static void main(String args[]){

        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};

    }


}


class Solution3 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int yLen = park.length; // 세로길이
        int xLen = park[0].length(); // 가로길이

        int[] start = new int[2]; // 시작위치 (x,y)
        int[] pos = new int[2]; // 현재위치 (x,y)

        String direction; // 방향
        int cnt; // 이동횟수

        for(int i = 0; i < park.length; i++){ // 출발지 세팅
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){ // 출발지라면
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        pos[0] = start[0]; // 현재위치 세팅
        pos[1] = start[1];

        for(int i = 0; i < routes.length; i++){
            StringTokenizer st = new StringTokenizer(routes[i]);

            direction = st.nextToken(); // 방향
            cnt = Integer.parseInt(st.nextToken()); // 이동거리

            // 이동 경로 확인 전 이동 거리가 현재위치 상에서 공원을 벗어나는지 확인
            // 거리 계산 후 방향에 맞게 함수 구현?
            // 동 (+ ) 서 (- ) 남( +) 북 ( -)
            // 이동 경로중에서 'X' 가 있는지 확인하고 만약 있다면 return false
            // 모든 경우 괜찮다면 pos update

            switch(direction){
                case "E":
                    if(pos[1] + cnt + 1 > xLen) break;
                    for(int k = 1; k < cnt +1; k++){
                        if (park[pos[0]].charAt(pos[1]+k) == 'X') break;
                        if (k == cnt) pos[1] = pos[1] + cnt;
                    }
                    break;

                case "W":
                    if(pos[1] - cnt + 1 < 0) break;
                    for(int k = 1; k < cnt +1; k++){
                        if (park[pos[0]].charAt(pos[1]-k) == 'X') break;
                        if (k == cnt)  pos[1] = pos[1] - cnt;
                    }
                    break;

                case "S":
                    if(pos[0] + cnt + 1 > yLen) break;
                    for(int k = 1; k < cnt +1; k++){
                        if (park[pos[0]+k].charAt(pos[1]) == 'X') break;
                        if (k == cnt)  pos[0] = pos[0] + cnt;
                    }
                    break;

                case "N":
                    if(pos[0] - cnt + 1 < 0) break;
                    for(int k = 1; k < cnt+1; k++){
                        if (park[pos[0]-k].charAt(pos[1]) == 'X') break;
                        if (k == cnt)  pos[0] = pos[0] - cnt;
                    }
                    break;
            }
        }
        answer[0] = pos[0];
        answer[1] = pos[1];

        return answer;
    }
}


