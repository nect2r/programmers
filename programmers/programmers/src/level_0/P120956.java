package level_0;
import java.util.regex.Pattern;

public class P120956 {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            
            for(int i=0; i<babbling.length; i++) {
                answer += match(babbling[i]);
            }
            
            return answer;
        }
        
        public int match(String str) {
            String[] word = {"aya","ye","woo","ma"};
            
            for(int i=0; i<word.length; i++) {
                str = str.replace(word[i], "0");
            }
                
            return Pattern.matches("^[0]+$",str) ? 1 : 0;
        }
    }
}