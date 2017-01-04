public class Solution085 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        int[] height = new int[n];
        Arrays.fill(right, n);
        
        int maxArea = 0;
        int curLeft = 0;
        int curRight = n;
        for(int i = 0; i < m; i++) {
            curLeft = 0;
            curRight = n;
            for(int j = n - 1; j >= 0; j--) {
                if(matrix[i][j] == '1') {
                    right[j] = Math.min(right[j], curRight);
                } else {
                    right[j] = n;
                    curRight = j;
                }
            }
            for(int j = 0; j < n; j++) {
               if(matrix[i][j] == '1') {
                   left[j] = Math.max(left[j], curLeft);
                   height[j]++;
               } else {
                   left[j] = 0;
                   curLeft = j + 1;
                   height[j] = 0;
               }
            }
            for(int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, (right[j] - left[j]) * height[j]);
            }
        }
        return maxArea;
    }
}