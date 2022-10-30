package level_0;

import java.util.Scanner;

public class P120845 {
    class Solution {
        public int solution(int[] box, int n) {
            int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
            return answer;
        }
    }
}