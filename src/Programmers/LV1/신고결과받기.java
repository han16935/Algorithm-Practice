package Programmers.LV1;
import java.util.*;

public class 신고결과받기 {
    class Solution {
        public int[] solution(String[] idList, String[] report, int k) {
            int [] answer = new int[idList.length];
            String from, to;
            StringTokenizer st;
            HashMap<String, Integer> indexMap = new HashMap<>(); // idList - index of idList
            HashMap<String, HashSet<String>> nameMap = new HashMap<>(); // 한 유저가 신고한 유저 저장
            HashMap<String, Integer> cntMap = new HashMap<>(); // 한 유저가 신고받은 횟수 저장
            int [][] visited = new int[idList.length][idList.length];

            for(int i=0;i<idList.length;i++){
                indexMap.put(idList[i], i);
                cntMap.put(idList[i], 0);
                nameMap.put(idList[i], new HashSet<String>());
            }

            for(String perReport : report){
                st = new StringTokenizer(perReport);
                from = st.nextToken();
                to = st.nextToken();

                if(visited[indexMap.get(from)][indexMap.get(to)] == 0) {
                    HashSet<String> s = nameMap.get(from);
                    s.add(to);
                    nameMap.put(from, s);
                    visited[indexMap.get(from)][indexMap.get(to)] = 1;
                    cntMap.put(to, cntMap.get(to) + 1);
                }
            }

            for(int i=0;i<idList.length;i++){
                String id = idList[i];
                Set<String> s = nameMap.get(id);
                for(String name : s){
                    if(cntMap.get(name) >= k) answer[i]++;
                }
            }
            return answer;
        }
    }
}
