package level_0;

public class P120585 {
    class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            
            for(int i=0; i<array.length; i++) {
                if(array[i] > height)
                    answer++;
            }
            
            return answer;
        }
    }
}