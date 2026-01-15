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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();

        temp1 = l1;
        temp2 = l2;

        int sum = 0;
        int carry = 0;
        int x = 0;
        int y = 0;

        List <Integer> ans = new LinkedList<>();

        while(temp1 != null || temp2 != null){

            if(temp1 != null){
                x = temp1.val;
            }
            else{
                x = 0;
            }

            if(temp2 != null){
                y = temp2.val;
            }
            else{
                y = 0;
            }

            sum = x + y + carry;
            
            if(sum >= 10){
            carry = sum / 10;
            sum = sum % 10;
            }

            else{
                carry = 0;
            }

            ans.add(sum);

            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        if(carry > 0) ans.add(carry);
        
    ListNode head = new ListNode();
    ListNode n1 = head;

    for(int i = 0; i < ans.size(); i++){
        n1.next = new ListNode(ans.get(i));
        n1 = n1.next;
    }

    return head.next;

    }
}
