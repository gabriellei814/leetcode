import java.util.*;

public class Solution386 {
  public static void main(String[] args) {
    System.out.println(lexicalOrder(100));
  }

  private static List<Integer> lexicalOrder(int n) {
    List<Integer> res = new ArrayList<>();
    for(int i = 1;i < 10; i++){
      dfs(i, n, res); 
    }
    return res;
  }
  
  private static void dfs(int cur, int n, List<Integer> res){
    if(cur > n) return;
    res.add(cur);
    for(int i = 0; i < 10; i++){
      dfs(10 * cur + i, n, res);
    }
  }
}