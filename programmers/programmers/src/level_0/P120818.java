package level_0;

public class P120818 {
    class Solution {
        public int solution(double price) {
            double answer = price >= 500000 ? price - (price / 100 * 20) : price >= 300000 ? 
                   price - (price / 100 * 10) : price >= 100000 ? price - (price / 100 * 5) : price;
            
            return (int)answer;
        }
    }
}