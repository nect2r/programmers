package level_0;

import java.util.Scanner;

public class P120893 {
    class Solution {
        public String solution(String my_string) {
            StringBuffer answer = new StringBuffer();
            char[] chars = my_string.toCharArray();
            for(char c: chars) {
                if((int)c < 97) {
                    answer.append(Character.toLowerCase(c));
                }else{
                    answer.append(Character.toUpperCase(c));
                }
            }
            return answer.toString();
        }
    }
}