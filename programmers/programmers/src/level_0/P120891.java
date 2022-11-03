package level_0;

public class P120891 {
    class Solution {
        public int solution(int order) {
            int answer = 0;
            char[] orderStr = Integer.toString(order).toCharArray();
            
            for(int i=0; i<orderStr.length; i++) {
                if(orderStr[i] != '0') {
                    if(orderStr[i] % 3 == 0) {
                        answer++;
                    }
                }
            }
            
            return answer;
        }
    }
}