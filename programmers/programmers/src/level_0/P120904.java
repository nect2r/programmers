package level_0;

import java.util.Scanner;

public class P120904 {
    class Solution {
        public int solution(int num, int k) {
            int answer = 0;
            String numStr = String.valueOf(num);
            char[] chars = numStr.toCharArray();
            
            for(int i=0; i<chars.length; i++) {
                if(k == chars[i]-48) {
                    answer = i+1;
                    break;
                }   
            }
            
            return answer == 0 ? -1 : answer;
        }
    }
}