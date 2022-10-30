package level_0;

import java.util.*;

public class P120909 {
    class Solution {
        public int solution(int n) {
            
            Double sq = Math.sqrt(n);
            
            if(sq != sq.intValue()) {
                return 2;
            }
            
            return 1;
        }
    }
}