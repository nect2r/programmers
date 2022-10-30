package level_0;

import java.util.*;

public class P120850 {
    class Solution {
        public int[] solution(String my_string) {
            my_string = my_string.replaceAll("[^0-9]","");
            int[] answer = new int[my_string.length()];
            
            for(int i=0; i<my_string.length(); i++) {
                answer[i] = my_string.charAt(i)-48;
            }
            
            Arrays.sort(answer);
            
            return answer;
        }
    }
}