package Programmers.LV1;
import java.util.*;

public class 성격유형_검사하기 {

    class Solution {
        static int [] scores = {3, 2, 1, 0, 1, 2, 3};

        static void addHash(HashMap<Character, Integer> h, String perSurvey, int choice){
            if(choice < 4) h.put(perSurvey.charAt(0), h.get(perSurvey.charAt(0)) + scores[choice-1]);
            if(choice > 4) h.put(perSurvey.charAt(1), h.get(perSurvey.charAt(1)) + scores[choice-1]);
        }

        public String solution(String[] survey, int[] choices) {
            StringBuilder answer = new StringBuilder();
            HashMap<Character, Integer> [] arr = new HashMap[4];
            for(int i=0;i<4;i++){
                arr[i] = new HashMap<>(); // rt, cf, jm, an
            }

            arr[0].put('R', 0);
            arr[0].put('T', 0);
            arr[1].put('C', 0);
            arr[1].put('F', 0);
            arr[2].put('J', 0);
            arr[2].put('M', 0);
            arr[3].put('A', 0);
            arr[3].put('N', 0);

            for(int j=0;j<survey.length;j++){
                String perSurvey = survey[j];
                if(perSurvey.equals("RT") || perSurvey.equals("TR")) addHash(arr[0], perSurvey, choices[j]);
                if(perSurvey.equals("CF") || perSurvey.equals("FC")) addHash(arr[1], perSurvey, choices[j]);
                if(perSurvey.equals("JM") || perSurvey.equals("MJ")) addHash(arr[2], perSurvey, choices[j]);
                if(perSurvey.equals("AN") || perSurvey.equals("NA")) addHash(arr[3], perSurvey, choices[j]);
            }

            for(int k=0;k<4;k++){
                Character userKey = null;
                int maxValue = 0;
                for(Character key : arr[k].keySet()){
                    if(userKey == null){
                        userKey = key;
                        maxValue = arr[k].get(key);
                    }

                    else{
                        if(maxValue > arr[k].get(key)) answer.append(userKey);
                        else if(maxValue < arr[k].get(key)) answer.append(key);
                        else{
                            if(Character.compare(key, userKey) < 0) answer.append(key);
                            else answer.append(userKey);
                        }
                    }
                }
            }
            return answer.toString();
        }
    }
}
