package Programmers.LV1;
import java.util.*;

public class 대충만든자판 {
    public int[] solution(String[] keyMap, String[] targets) {
        int charMin;
        int [] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for(String key : keyMap){
            for(int i=0;i<key.length();i++){
                if(!map.containsKey(key.charAt(i))) map.put(key.charAt(i), i + 1);
                else{
                    charMin = map.get(key.charAt(i));
                    if(i + 1 < charMin) map.put(key.charAt(i), i + 1);
                }
            }
        }

        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
                if(!map.containsKey(targets[i].charAt(j))){
                    answer[i] = -1;
                    break;
                }
                else answer[i] += map.get(targets[i].charAt(j));
            }
        }
        return answer;
    }
}
