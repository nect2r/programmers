package level_0;

public class P120812 {
    class Solution {
        public int solution(int[] array) {
            int[] index = new int[1000];
            int last = 0;
            int lastCnt = Integer.MIN_VALUE;
            
            int beforeCnt = Integer.MIN_VALUE;
            
            for(int i=0; i<array.length; i++) {
                index[array[i]]++;
            }
            
            for(int i=0; i<index.length; i++) {
                if(index[i] > lastCnt) {
                    lastCnt = index[i];
                    last = i;
                }else if(index[i] == lastCnt) {
                    beforeCnt = index[i];
                }
            }
            
            if(lastCnt == beforeCnt) {
                return -1;
            }
            
            return last;
        }
    }
}