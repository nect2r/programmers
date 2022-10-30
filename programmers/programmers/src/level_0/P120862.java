package level_0;

public class P120862 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = numbers[0] * numbers[1];
            
            for(int i=0; i<numbers.length; i++) {
                for(int j=1; j<numbers.length; j++) {
                    if(i != j && answer < numbers[i] * numbers[j])
                        answer = numbers[i] * numbers[j];
                }
            }
            
            return answer;
        }
    }
}