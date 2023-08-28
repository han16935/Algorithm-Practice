package Programmers.LV1;
import java.util.*;

public class 키패드_누르기 {
    static class Solution {
        static int [] leftPos = {3, 0};
        static int [] rightPos = {3, 2};

        // 입력받은 hand와 number의 거리 return (number == 2, 5, 8, 0 한정)
        static int getDis(int [] hand, int number){
            if(number == 0) return Math.abs(hand[0] - 3) + Math.abs(hand[1] - 1);
            else return Math.abs(hand[0] - number/3) + Math.abs(hand[1] - 1);
        }

        public static String solution(int[] numbers, String hand) {
            StringBuilder answer = new StringBuilder();
            int leftDis, rightDis;
            for(int number : numbers){
                if(number == 1 || number == 4 || number == 7){
                    leftPos[0] = number / 3;
                    leftPos[1] = 0;
                    System.out.println("leftPos[0]" + leftPos[0]);
                    System.out.println("leftPos[1]" + leftPos[1]);
                    answer.append("L");
                }

                else if(number == 3 || number == 6 || number == 9){
                    rightPos[0] = number / 3 - 1;
                    rightPos[1] = 2;
                    System.out.println("rightPos[0]" + rightPos[0]);
                    System.out.println("rightPos[1]" + rightPos[1]);
                    answer.append("R");
                }

                else{
                    leftDis = getDis(leftPos, number);
                    rightDis = getDis(rightPos, number);
                    System.out.println("number = " + number);
                    System.out.println("leftDis = " + leftDis + " rightDis = " + rightDis);
                    if(leftDis == rightDis){
                        if(hand.equals("left")){
                            if(number == 0) leftPos[0] = 3;
                            else leftPos[0] = number/3;
                            leftPos[1] = 1;
                            answer.append("L");
                        }
                        else{
                            if(number == 0) rightPos[0] = 3;
                            else rightPos[0] = number/3;
                            rightPos[1] = 1;
                            answer.append("R");
                        }
                    }

                    else if(leftDis < rightDis){
                        if(number == 0) leftPos[0] = 3;
                        else leftPos[0] = number/3;
                        leftPos[1] = 1;
                        answer.append("L");
                    }

                    else{
                        if(number == 0) rightPos[0] = 3;
                        else rightPos[0] = number/3;
                        rightPos[1] = 1;
                        answer.append("R");
                    }
                }
            }
            return answer.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }
}
