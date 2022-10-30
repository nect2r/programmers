package level_0;

import java.util.*;

public class P120911 {
    class Solution {
        public String solution(String my_string) {
            StringBuffer answer = new StringBuffer();
            char[] c = my_string.toLowerCase().toCharArray();
            
            Arrays.sort(c);
            
            for(char ch : c) {
                answer.append(ch);
            }
            
            return answer.toString();
        }
    }
}