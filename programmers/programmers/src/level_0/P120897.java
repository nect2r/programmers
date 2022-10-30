package level_0;

import java.util.*;

public class P120897 {
    class Solution {
        public List<Integer> solution(int n) {
            List<Integer> answer = new ArrayList();    
        
            for(int i=1; i<=n; i++) {
                if(n % i == 0) {
                    answer.add(i);
                }
            }
            
            return answer;
        }
    }
}