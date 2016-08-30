public class Solution383 {
  public static void main(String[] args) {
    System.out.println(canConstruct("aa", "aba"));
  }
  public static boolean canConstruct(String ransomNote, String magazine) {
    int[] dict = new int[26];
    for(int i = 0; i < magazine.length(); i++) {
      dict[magazine.charAt(i) - 'a']++;
    }
    for(int i = 0; i < ransomNote.length(); i++) {
      if(--dict[ransomNote.charAt(i) - 'a'] < 0) {
        return false;
      }
    }
    return true;
  }
}