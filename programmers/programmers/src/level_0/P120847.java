package level_0;

public class P120847 {
    class Solution {
        public int solution(int[] numbers) {
            int beforePoint = numbers[0];
            int point = numbers[1];
            
            for(int i=2; i<numbers.length; i++) {
                if(numbers[i] > beforePoint) {
                    beforePoint = numbers[i];
                }
                
                if(beforePoint > point) {
                    int temp = point;
                    point = beforePoint;
                    beforePoint = temp;
                }
            }
            
            return point * beforePoint;
        }
    }
}