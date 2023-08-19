package Programmers.LV1;
import java.util.*;

public class 덧칠하기 {
    static class node implements Comparable<node>{
        int start;
        int length;

        public node(int start, int length){
            this.start = start;
            this.length = length;
        }

        public int compareTo(node n){
            return start - n.start;
        }
    }

    public int solution(int n, int m, int[] section) {
        int start, length, answer = 0;
        int [] visited = new int[n+1];
        PriorityQueue<node> pq = new PriorityQueue<>();
        for(int i=0;i<section.length;i++){
            if(section[i] + m - 1 <= n) pq.add(new node(section[i], m));
            else pq.add(new node(section[i], n - section[i] + 1));
        }

        while(!pq.isEmpty()){
            node popped = pq.poll();
            start = popped.start;
            length = popped.length;
            if(visited[start] == 1) continue;
            for(int j=start;j<start+length;j++){
                visited[j] = 1;
            }
            answer++;
        }
        return answer;
    }
}
