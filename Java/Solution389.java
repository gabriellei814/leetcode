public class Solution389 {
  public static void main(String[] args) {
    String s = "aabe";
    String t = "abeae";
    System.out.println(findTheDifference(s, t));
  }
  public char findTheDifference(String s, String t) {
    char sum = 0;
    for(int i = 0; i < s.length(); i++) {
      sum ^= s.charAt(i);
    }
    for(int i = 0; i < t.length(); i++) {
      sum ^= t.charAt(i);
    }
    return sum;
  }
}