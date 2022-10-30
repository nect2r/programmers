package level_0;

public class P120813 {
    class Solution {
        public int[] solution(int n) {
            int[] answer = {};
            
            if(n % 2 ==0) {
                answer = new int[n/2];
            } else {
                answer = new int[n/2+1];
            }
            
            int diff = 1;
            for(int i=1; i<=n; i+=2) {
                answer[i-diff] = i;
                diff++;
            }
            
            return answer;
        }
    }
}