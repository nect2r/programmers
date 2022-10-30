package level_0;

public class P120815 {
    class Solution {
        public int solution(int n) {
            return LCM(n, 6) / 6;
        }
        
        public int GCD(int a, int b) {
            if(a % b == 0) 
                return b;
            return GCD(b, a % b);
        }
        
        public int LCM(int a, int b) {
            return a * b / GCD(a, b);
        }
    }
}