public class Solution270 {
    public static void main(String[] args) {
      TreeNode root = new TreeNode(5);
      root.left = new TreeNode(3);
      root.left.left = new TreeNode(1);
      root.left.right = new TreeNode(4);
      root.right = new TreeNode(6);
      System.out.println(closestValue(root, 4.6));
    }
    private static int closestValue(TreeNode root, double target) {
        int val = root.val;
        TreeNode next = val < target ? root.right : root.left;
        if(next == null) return val;
        int min = closestValue(next, target);
        return Math.abs(min - target) < Math.abs(val - target) ? min : val;
    }
}