public class Solution174 {
  public static void main(String[] args) {
    int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
    System.out.println(calculateMinimumHP(dungeon));
  }

  public static int calculateMinimumHP(int[][] dungeon) {
    int m = dungeon.length;
    int n = dungeon[0].length;
    int[][] health = new int[m][n];
    health[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
    for(int i = m - 2; i >= 0; i--) {
      health[i][n - 1] = Math.max(1, health[i + 1][n - 1] - dungeon[i][n - 1]);
    }
    for(int i = n - 2; i >= 0; i--) {
      health[m - 1][i] = Math.max(1, health[m - 1][i + 1] - dungeon[m - 1][i]);
    }
    for(int i = m - 2; i >= 0; i--) {
      for(int j = n - 2; j >= 0; j--) {
        int right = Math.max(1, health[i][j + 1] - dungeon[i][j]);
        int down = Math.max(1, health[i + 1][j] - dungeon[i][j]);
        health[i][j] = Math.min(right, down);
      }
    }
    return health[0][0];
  }
}