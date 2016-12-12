import java.lang.Math;

public class Solution072 {

    public static void main(String[] args) {
      String word1 = "ab";
      String word2 = "bA";
      System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] cost = new int[m + 1][n + 1];
        
        for(int i = 0; i < m + 1; i++) {
            cost[i][0] = i;
        }
        
        for(int i = 0; i < n + 1; i++) {
            cost[0][i] = i;
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(word1.charAt(i) == word2.charAt(j)) {
                    cost[i + 1][j + 1] = cost[i][j];
                } else {
                    cost[i + 1][j + 1] = 1 + Math.min(cost[i][j + 1], Math.min(cost[i][j], cost[i + 1][j]));
                }
            }
        }
        
        return cost[m][n];
    }
}