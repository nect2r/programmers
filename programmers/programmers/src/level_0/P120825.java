package level_0;

public class P120825 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuffer answer = new StringBuffer();
            
            for(int i=0; i<my_string.length(); i++) {
                for(int j=0; j<n; j++) {
                    answer.append(my_string.charAt(i));
                }
            }
            
            return answer.toString();
        }
    }
}