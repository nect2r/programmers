package level_0;

public class P120889 {
    class Solution {
        public int solution(int[] sides) {
            int maxPoint = 0;
            int max = 0;
            for(int i=0; i<sides.length; i++) {
                if(sides[maxPoint] < sides[i]) {
                    maxPoint = i;
                }
                max += sides[i];
            }
            
            if(max - sides[maxPoint] > sides[maxPoint]){
                return 1;
            }else{
                return 2;
            }
        }
    }
}