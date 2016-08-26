public class Solution387 {
  public static void main(String[] args) {
    String test = "loveleetcode";
    System.out.println(firstUniqChar(test));
  }
  public static int firstUniqChar(String s) {
    int[] map = new int[26];
    for (int i = 0; i < s.length(); i++) {
      map[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
      if (map[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }
}