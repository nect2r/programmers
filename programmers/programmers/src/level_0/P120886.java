package level_0;

public class P120886 {
    class Solution {
        public int solution(String before, String after) {
            int beforeSum = 0;
            int afterSum = 0;
            
            char[] beforeChars = before.toCharArray();
            char[] afterChars = after.toCharArray();
            
            for(int i=0; i<beforeChars.length; i++) {
                beforeSum += beforeChars[i];
                afterSum += afterChars[i];
            }
            
            return beforeSum == afterSum ? 1 : 0;
        }
    }
}