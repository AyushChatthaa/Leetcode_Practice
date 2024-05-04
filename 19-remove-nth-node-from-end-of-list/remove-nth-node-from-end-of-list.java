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
        int k=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            k++;
        }
        if(k==n)
        return head.next;
        // k=k-n;
        curr=head;
        int count=1;
        while(count!=k-n){
            curr=curr.next;
            count++;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
        return head;
    }
}