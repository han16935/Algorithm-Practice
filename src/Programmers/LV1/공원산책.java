package Programmers.LV1;

import java.util.*;

public class 공원산책 {
    public static void main(String[] args) {
        String [] park = {"OOOOO", "OOOOO", "OOSOO", "OOOOO", "OOOOO"};
        String[] routes = {"E 3", "W 3", "S 3", "N 3", "E 2", "E 1"};
        int[] answer = new int[2];
        char direction;
        int dis, flag;

        // Find Start position
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j) == 'S'){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        for(int i=0;i<routes.length;i++){
            System.out.println(i);
            System.out.println(answer[0] + " " + answer[1]);
            direction = routes[i].charAt(0);
            dis = routes[i].charAt(2) - '0';
            flag = 1;

            if(direction == 'N' && answer[0]-dis>=0){
                for(int j=answer[0];j>=answer[0]-dis;j--){
                    if(park[j].charAt(answer[1]) == 'X'){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) answer[0]-=dis;
            }

            if(direction == 'S' && answer[0]+dis<park.length){
                for(int j=answer[0];j<=answer[0]+dis;j++){
                    if(park[j].charAt(answer[1]) == 'X'){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) answer[0]+=dis;
            }

            if(direction == 'W' && answer[1]-dis>=0){
                for(int j=answer[1];j>=answer[1]-dis;j--){
                    if(park[answer[0]].charAt(j) == 'X'){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) answer[1]-=dis;
            }

            if(direction == 'E' && answer[1]+dis<park[answer[0]].length()){
                for(int j=answer[1];j<=answer[1]+dis;j++){
                    if(park[answer[0]].charAt(j) == 'X'){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) answer[1]+=dis;
            }
        }
    }
}
