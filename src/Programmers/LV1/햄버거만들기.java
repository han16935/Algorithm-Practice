package Programmers.LV1;
import java.util.*;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int [] ingredients = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int size, answer = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<ingredients.length;i++){
            s.push(ingredients[i]);
            if(s.size() >= 4) {
                size = s.size();
                if(s.get(size - 1) == 1 &&s.get(size-2) == 3 &&s.get(size-3) == 2 &&s.get(size-4) == 1){
                    for (int j = 0; j < 4; j++) s.pop();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
