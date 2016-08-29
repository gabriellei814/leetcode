import java.util.Stack;

public class Solution388 {
  public static void main(String[] args) {
    String path = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
    System.out.println(lengthLongestPath(path));
  }

  private static int lengthLongestPath(String input) {
    Stack<Integer> stack = new Stack<Integer>();
      int max = 0;
      for(String s: input.split("\n")) {
        int level = s.lastIndexOf("\t") + 1;
        while(level < stack.size()) stack.pop();
        int len = (stack.empty() ? 0 : stack.peek()) + s.length() - level + 1;
        stack.push(len);
        if(s.contains(".")) max = Math.max(len - 1, max);
      }
      return max;
    }
}