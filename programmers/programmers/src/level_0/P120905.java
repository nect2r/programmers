package level_0;

import java.util.*;

public class P120905 {
    class Solution {
        public List<Integer> solution(int n, int[] numlist) {
            List<Integer> list = new ArrayList();
            
            for(int num : numlist) {
                if(num % n == 0)
                    list.add(num);
            }
            
            return list;
        }
    }
}