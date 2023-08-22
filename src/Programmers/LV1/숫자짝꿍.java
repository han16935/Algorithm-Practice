package Programmers.LV1;

import java.util.HashMap;

public class 숫자짝꿍 {
    class Solution {
        public String solution(String X, String Y) {
            int cnt;
            StringBuilder answer = new StringBuilder();
            HashMap<Character, Integer> h1 = new HashMap<>();
            HashMap<Character, Integer> h2 = new HashMap<>();
            for(int i=0;i<X.length();i++){
                if(h1.containsKey(X.charAt(i))) h1.put(X.charAt(i), h1.get(X.charAt(i)) + 1);
                else h1.put(X.charAt(i), 1);
            }

            for(int i=0;i<Y.length();i++){
                if(h2.containsKey(Y.charAt(i))) h2.put(Y.charAt(i), h2.get(Y.charAt(i)) + 1);
                else h2.put(Y.charAt(i), 1);
            }

            for(int j=9;j>0;j--){
                if(h1.containsKey(Integer.toString(j).charAt(0)) && h2.containsKey(Integer.toString(j).charAt(0))){
                    cnt = Math.min(h1.get(Integer.toString(j).charAt(0)), h2.get(Integer.toString(j).charAt(0)));
                    for(int k=0;k<cnt;k++) answer.append(Integer.toString(j));
                }
            }

            if(h1.containsKey('0') && h2.containsKey('0')){
                if(!answer.toString().isEmpty()){
                    cnt = Math.min(h1.get('0'), h2.get('0'));
                    for(int k=0;k<cnt;k++) answer.append("0");
                }

                else answer.append("0");
            }

            if(answer.length() == 0) return "-1";
            return answer.toString();
        }
    }
}
