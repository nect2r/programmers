package level_0;

public class P120816 {
    class Solution {
        public int solution(int slice, int n) {
            int minSlice = slice;
            int count = 1;
            
            while(slice < n) {
                slice += minSlice;
                count++;
            }
            
            return count;
        }
    }
}