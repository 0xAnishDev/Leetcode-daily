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
    public ListNode removeElements(ListNode head, int val) {
        //two pointer approach, curr = 1 behind ; temp = fast moving checker

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode temp = head;

        if (head == null) {
            return dummy.next;
        }
        while (curr.next != null) {
            while (curr.next != null && curr.next.val != val) {
                curr = curr.next;
                temp = temp.next;
            }
            if (temp != null) {
                temp = temp.next;
            }
            while (temp != null && temp.val == val) {
                if (temp.next == null) {
                    curr.next = null;
                    return dummy.next;
                }
                temp = temp.next;
            }
            curr.next = temp;
        }
        return dummy.next;
    }
}
