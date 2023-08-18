package Programmers.LV1;


public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int leftMax = wallpaper[0].length();
        int rightMax = 0;
        int topMax = wallpaper.length;
        int bottomMax = 0;

        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(i<topMax) topMax = i;
                    if(bottomMax<i) bottomMax = i;
                    if(j<leftMax) leftMax = j;
                    if(rightMax<j) rightMax = j;
                }
            }
        }

        answer[0] = topMax;
        answer[1] = leftMax;
        answer[2] = bottomMax+1;
        answer[3] = rightMax+1;
        return answer;
    }
}
