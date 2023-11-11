package Programmers;

import java.util.HashMap;
import java.util.Map;

// 04.25 화
// 프로그래머스 안에서 함수 선언 확인 필요
public class PRO_달리기경주 { // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public static void main(String[] args) {

        // 문자열 배열 선언 확인 필요
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        //String[] answer = Solution.solution(players, callings);

    }
}

class Solution { // 시간 초과 해결필요
    public static String[] solution2(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<Integer, String> rank = new HashMap<Integer, String>();
        Map<String, Integer> racer = new HashMap<String, Integer>();

        int i = 0;

        for(String name : players){ // setting
            rank.put(i+1, name);
            racer.put(name, i+1);
            i++;
        }

        i = 0;

        for(String call : callings){
            String backName; // 역전당한 사람의 이름
            int backRank;    // 역전한 사람의 기존 등수

            backName = rank.get(racer.get(call)-1);
            backRank = racer.get(call);

            // 등수, 사람 업데이트
            rank.put(backRank, backName);
            rank.put(backRank-1, call);

            // 사람, 등수 업데이트
            racer.put(backName, backRank);
            racer.put(call, backRank-1);
        }

        i = 0;

        for(String ans : rank.values()){
            answer[i+1] = ans;
            i++;
        }

        // System.out.println(Arrays.toString(answer));


        /*
        for(int i = 0; i < callings.length; i++){ // calling 길이만큼 반복
            for(int j = 0; j < players.length; j++) { // player 길이만큼 반복

                if(players[j].equals(callings[i])){ // 문자열 비교
                    String temp = players[j]; // switch java 함수 확인 필요
                    players[j] = players[j-1];
                    players[j-1] = temp;
                    break;
                }
            }
        }

        answer = players;
        */
        return answer;
    }
}