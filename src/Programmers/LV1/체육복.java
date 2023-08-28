package Programmers.LV1;
import java.util.*;

public class 체육복 {
    static class Solution {
        public static int solution(int n, int[] lost, int[] reserve) {
            int lostIdx = 0;
            int reserveIdx = 0;
            int answer = 0;
            Arrays.sort(lost);
            Arrays.sort(reserve);
            while(lostIdx < lost.length && reserveIdx < reserve.length){
                if(lost[lostIdx] - 1 == reserve[reserveIdx]){
                    lostIdx++;
                    reserveIdx++;
                }

                else if(lost[lostIdx] - 1 < reserve[reserveIdx]) {
                    lostIdx++;
                    answer--;
                }

                else if(lost[lostIdx] - 1 > reserve[reserveIdx]){
                    reserveIdx++;
                    answer--;
                }

                else{

                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution.solution(5, new int[] {2, 4}, new int[] {1, 3, 5});
    }
}
