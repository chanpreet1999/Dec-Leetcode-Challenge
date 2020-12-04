/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    ArrayList< Integer > al;
    Random r = new Random();
    
    public Solution(ListNode head) {
        al = new ArrayList<>();
        for(ListNode cur = head; cur != null; cur = cur.next)
            al.add( cur.val );
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        return al.get( r.nextInt( al.size() ) );
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */