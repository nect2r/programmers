package level_0;

public class P120839 {
    class Solution {
        public String solution(String rsp) {
            StringBuffer answer = new StringBuffer();
            
            char[] chars = rsp.toCharArray();
            
            for(char c : chars) {
                if(c == '2') answer.append("0");
                if(c == '0') answer.append("5");
                if(c == '5') answer.append("2");
            }
            
            return answer.toString();
        }
    }
}