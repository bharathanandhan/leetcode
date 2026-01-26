/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode temp=head;
        ListNode temp1=head;
        while(temp!=null&&temp.next!=null){
            temp1=temp1.next;
            temp=temp.next.next;
            if(temp==temp1)return true;
        }
        return false;
    }
}