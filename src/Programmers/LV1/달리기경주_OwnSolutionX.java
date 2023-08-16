package Programmers.LV1;

import java.util.*;

public class 달리기경주_OwnSolutionX {

    class Solution {

        public String[] solution(String[] players, String[] callings) {
            int rank;
            String beforeAthlete = new String("");
            String [] answer = new String[players.length];
            HashMap<String, Integer> nameKeyMap = new HashMap<>();
            HashMap<Integer, String> rankKeyMap = new HashMap<>();
            for(int i=0;i<players.length;i++){
                nameKeyMap.put(players[i], i);
                rankKeyMap.put(i, players[i]);
            }

            for(int j=0;j<callings.length;j++){
                rank = nameKeyMap.get(callings[j]);
                beforeAthlete = rankKeyMap.get(rank-1);

                nameKeyMap.put(callings[j], rank-1);
                nameKeyMap.put(beforeAthlete, rank);

                rankKeyMap.put(rank-1, callings[j]);
                rankKeyMap.put(rank, beforeAthlete);
            }

            for(int k=0;k<answer.length;k++){
                answer[k] = rankKeyMap.get(k);
            }

            return answer;
        }
    }
}
