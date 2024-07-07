package Programmers_kit;

import java.util.HashMap;
import java.util.Map;

// 04.25 ?™”
// ?”„ë¡œê·¸?˜ë¨¸ìŠ¤ ?•ˆ?—?„œ ?•¨?ˆ˜ ?„ ?–¸ ?™•?¸ ?•„?š”
public class PRO_?‹¬ë¦¬ê¸°ê²½ì£¼ { // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public static void main(String[] args) {

        // ë¬¸ì?—´ ë°°ì—´ ?„ ?–¸ ?™•?¸ ?•„?š”
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        //String[] answer = Solution.solution(players, callings);

    }
}

class Solution { // ?‹œê°? ì´ˆê³¼ ?•´ê²°í•„?š”
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
            String backName; // ?—­? „?‹¹?•œ ?‚¬?Œ?˜ ?´ë¦?
            int backRank;    // ?—­? „?•œ ?‚¬?Œ?˜ ê¸°ì¡´ ?“±?ˆ˜

            backName = rank.get(racer.get(call)-1);
            backRank = racer.get(call);

            // ?“±?ˆ˜, ?‚¬?Œ ?—…?°?´?Š¸
            rank.put(backRank, backName);
            rank.put(backRank-1, call);

            // ?‚¬?Œ, ?“±?ˆ˜ ?—…?°?´?Š¸
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
        for(int i = 0; i < callings.length; i++){ // calling ê¸¸ì´ë§Œí¼ ë°˜ë³µ
            for(int j = 0; j < players.length; j++) { // player ê¸¸ì´ë§Œí¼ ë°˜ë³µ

                if(players[j].equals(callings[i])){ // ë¬¸ì?—´ ë¹„êµ
                    String temp = players[j]; // switch java ?•¨?ˆ˜ ?™•?¸ ?•„?š”
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