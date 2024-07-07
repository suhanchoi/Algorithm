package Programmers_kit;

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

        int yLen = park.length; // �꽭濡쒓만�씠
        int xLen = park[0].length(); // 媛�濡쒓만�씠

        int[] start = new int[2]; // �떆�옉�쐞移� (x,y)
        int[] pos = new int[2]; // �쁽�옱�쐞移� (x,y)

        String direction; // 諛⑺뼢
        int cnt; // �씠�룞�슏�닔

        for(int i = 0; i < park.length; i++){ // 異쒕컻吏� �꽭�똿
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){ // 異쒕컻吏��씪硫�
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        pos[0] = start[0]; // �쁽�옱�쐞移� �꽭�똿
        pos[1] = start[1];

        for(int i = 0; i < routes.length; i++){
            StringTokenizer st = new StringTokenizer(routes[i]);

            direction = st.nextToken(); // 諛⑺뼢
            cnt = Integer.parseInt(st.nextToken()); // �씠�룞嫄곕━

            // �씠�룞 寃쎈줈 �솗�씤 �쟾 �씠�룞 嫄곕━媛� �쁽�옱�쐞移� �긽�뿉�꽌 怨듭썝�쓣 踰쀬뼱�굹�뒗吏� �솗�씤
            // 嫄곕━ 怨꾩궛 �썑 諛⑺뼢�뿉 留욊쾶 �븿�닔 援ы쁽?
            // �룞 (+ ) �꽌 (- ) �궓( +) 遺� ( -)
            // �씠�룞 寃쎈줈以묒뿉�꽌 'X' 媛� �엳�뒗吏� �솗�씤�븯怨� 留뚯빟 �엳�떎硫� return false
            // 紐⑤뱺 寃쎌슦 愿쒖갖�떎硫� pos update

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


