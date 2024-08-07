package Programmers_kit;

import java.util.HashMap;
import java.util.Map;

// 04.25 ?
// ?λ‘κ·Έ?λ¨Έμ€ ??? ?¨? ? ?Έ ??Έ ??
public class PRO_?¬λ¦¬κΈ°κ²½μ£Ό { // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public static void main(String[] args) {

        // λ¬Έμ?΄ λ°°μ΄ ? ?Έ ??Έ ??
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        //String[] answer = Solution.solution(players, callings);

    }
}

class Solution { // ?κ°? μ΄κ³Ό ?΄κ²°ν?
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
            String backName; // ?­? ?Ή? ?¬?? ?΄λ¦?
            int backRank;    // ?­? ? ?¬?? κΈ°μ‘΄ ?±?

            backName = rank.get(racer.get(call)-1);
            backRank = racer.get(call);

            // ?±?, ?¬? ??°?΄?Έ
            rank.put(backRank, backName);
            rank.put(backRank-1, call);

            // ?¬?, ?±? ??°?΄?Έ
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
        for(int i = 0; i < callings.length; i++){ // calling κΈΈμ΄λ§νΌ λ°λ³΅
            for(int j = 0; j < players.length; j++) { // player κΈΈμ΄λ§νΌ λ°λ³΅

                if(players[j].equals(callings[i])){ // λ¬Έμ?΄ λΉκ΅
                    String temp = players[j]; // switch java ?¨? ??Έ ??
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