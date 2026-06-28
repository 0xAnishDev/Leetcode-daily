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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int counter = 1;
        while(curr != null && curr.next != null){
            counter++;
            curr = curr.next;
        }
        counter = (counter/2)+1;
        curr = head;
        for(int i = 1; i<counter; i++){
            curr = curr.next;
        }
        return curr;
    }
}
