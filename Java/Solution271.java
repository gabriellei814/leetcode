import java.util.*;

public class Solution271 {
  public static class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s.length()).append("/").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            int slash = s.indexOf("/", i);
            int size = Integer.valueOf(s.substring(i, slash));
            res.add(s.substring(slash + 1, slash + size + 1));
            i = slash + size + 1;
        }
        return res;
    }
  }

  public static void main(String[] args) {
    String[] str = {"hello", "/solution", "271/"};
    List<String> strs = Arrays.asList(str);
    Codec codec = new Codec();
    System.out.println(codec.decode(codec.encode(strs)));
  }
}