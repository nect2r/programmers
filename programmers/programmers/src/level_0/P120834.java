package level_0;

import java.util.Scanner;

public class P120834 {
    class Solution {
        public String solution(int age) {
            StringBuffer answer = new StringBuffer();
            char[] chars = String.valueOf(age).toCharArray();
            
            for(char c : chars) {
                answer.append((char)(c+49));
            }
            
            /*
                0 48
                1 49
                2 50
                3 51
            */
            
            return answer.toString();
        }
    }
}