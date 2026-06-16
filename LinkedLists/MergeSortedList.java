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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while(list1 != null || list2 != null){
            if(list1 == null){
                tail.next = list2;
                break;
            }
            if(list2 == null) {
                tail.next = list1;
                break;
            }
            ListNode temp2 = new ListNode(0);
            if(list1.val<=list2.val){
                temp2.val = list1.val;
                tail.next = temp2;
                list1 = list1.next;
                tail = tail.next;
            }
            else {
                temp2.val = list2.val;
                tail.next = temp2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        return temp.next;
    }
}
