package Programmers.LV1;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int tmp;
        int[] answer = new int[photo.length];
        HashMap<String, Integer> m = new HashMap<>();
        for(int i=0;i<name.length;i++){
            m.put(name[i], yearning[i]);
        }

        for(int j=0;j<photo.length;j++){
            tmp = 0;
            for(int k=0;k<photo[j].length;k++){
                if(m.containsKey(photo[j][k])) tmp+=m.get(photo[j][k]);
            }
            answer[j] = tmp;
        }
        return answer;
    }
}
