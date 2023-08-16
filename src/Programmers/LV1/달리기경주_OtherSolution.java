package Programmers.LV1;

import java.util.*;

public class 달리기경주_OtherSolution {
    class Solution {

        public String[] solution(String[] players, String[] callings) {
            int rank;
            String tmp;
            HashMap<String, Integer> m = new HashMap<>();
            for(int i=0;i<players.length;i++){
                m.put(players[i], i);
            }

            for(String calling : callings){
                rank = m.get(calling);
                tmp = players[rank];
                players[rank] = players[rank-1];
                players[rank-1] = tmp;
                m.put(players[rank-1], rank-1);
                m.put(players[rank], rank);
            }

            return players;
        }
    }
}
