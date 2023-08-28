package Programmers.LV1;
import java.util.*;

public class 크레인_인형뽑기_게임 {

    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int doll, answer = 0;
            Stack<Integer> s = new Stack<>();
            for(int move : moves){
                for(int j = 0;j<board[move-1].length;j++){
                    if(board[j][move-1] != 0){
                        doll = board[j][move-1];
                        if(!s.isEmpty() && s.peek() == doll){
                            s.pop();
                            answer+=2;
                        }
                        else s.push(doll);
                        board[j][move-1] = 0;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
