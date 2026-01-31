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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count =0;
       ListNode temp=head;

       while(temp!=null){
        count++;
        temp=temp.next;
       } 

       int rev=count-n-1;
       temp=head;
       if(count==n)return head.next;
       for(int i=0;i<rev;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
    return head;
    }
}