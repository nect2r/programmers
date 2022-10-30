package level_0;

public class P120837 {
    class Solution {
        public static int answer = 0;
        
        public int solution(int hp) {
            return optimize(hp);
        }
        
        public int optimize(int hp) {
            if(hp < 3) 
                answer += hp/1;
            if(hp == 3) 
                answer += 1;
            if(hp == 4) 
                answer += 2;
            if(hp >= 5) {
                if(hp % 5 == 0) {
                    answer += hp/5;
                }else{
                    answer += hp/5;
                    return optimize(hp%5);
                }
            }
            return answer;
        }
    }
}