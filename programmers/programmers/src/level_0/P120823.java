package level_0;

import java.util.Scanner;

public class P120823 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            for(int i=1; i<=n; i++) {
                for(int j=0; j<i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}