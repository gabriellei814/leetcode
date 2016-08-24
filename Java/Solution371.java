//Sum of Two Integers

// Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

// Example:
// Given a = 1 and b = 2, return 3.

public class Solution371 {
  public static void main(String[] args) {
    int a = 2;
    int b = 5;
    System.out.println(getSum(a, b));
  }

  public static int getSum(int a, int b) {
    if(a == 0) return b;
    if(b == 0) return a;
    
    while(b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
    }
    return a;
  }
}