package Programmers.LV1;
import java.util.*;

public class 완주하지_못한_선수 {
    class Solution {
        public String solution(String[] participants, String[] completion) {
            String answer = "";
            Arrays.sort(participants);
            Arrays.sort(completion);
            for(int i=0;i<completion.length;i++){
                if(!participants[i].equals(completion[i])){
                    answer = participants[i];
                    break;
                }
            }

            if(answer.length() == 0) answer = participants[participants.length - 1];
//         HashMap<String, Integer> pm = new HashMap<>();
//         HashMap<String, Integer> cm = new HashMap<>();
//         HashMap<String, Boolean> bm = new HashMap<>();

//         for(String c : completion){
//             if(!cm.containsKey(c)) cm.put(c, 1);
//             else cm.put(c, cm.get(c) + 1);
//         }

//         for(String p : participants){
//             if(!pm.containsKey(p)) pm.put(p, 1);
//             else pm.put(p, pm.get(p) + 1);
//             if(!bm.containsKey(p)) bm.put(p, false);
//             if(!cm.containsKey(p)){
//                 answer = p;
//                 break;
//             }
//         }

//       if(answer.length() == 0){
//          for(String p : participants){
//             if(bm.get(p) == false){
//                if(pm.get(p) != cm.get(p)){
//                 answer = p;
//                 break;
//                }

//                bm.put(p, true);
//             }

//         }
//       }
            return answer;
        }
    }
}
