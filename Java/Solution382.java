/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    private ListNode list;
    private Random random;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.list = head;
        this.random = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode res = null;
        ListNode p = this.list;
        for(int n = 1; p != null; n++) {
            if(random.nextInt(n) == 0) 
                res = p;
            p = p.next;
        }
        return res.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */