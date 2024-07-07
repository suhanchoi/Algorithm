package Programmers_kit;

import java.util.HashMap;
import java.util.Map;

// 04.25 ?��
// ?��로그?��머스 ?��?��?�� ?��?�� ?��?�� ?��?�� ?��?��
public class PRO_?��리기경주 { // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public static void main(String[] args) {

        // 문자?�� 배열 ?��?�� ?��?�� ?��?��
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        //String[] answer = Solution.solution(players, callings);

    }
}

class Solution { // ?���? 초과 ?��결필?��
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
            String backName; // ?��?��?��?�� ?��?��?�� ?���?
            int backRank;    // ?��?��?�� ?��?��?�� 기존 ?��?��

            backName = rank.get(racer.get(call)-1);
            backRank = racer.get(call);

            // ?��?��, ?��?�� ?��?��?��?��
            rank.put(backRank, backName);
            rank.put(backRank-1, call);

            // ?��?��, ?��?�� ?��?��?��?��
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

                if(players[j].equals(callings[i])){ // 문자?�� 비교
                    String temp = players[j]; // switch java ?��?�� ?��?�� ?��?��
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