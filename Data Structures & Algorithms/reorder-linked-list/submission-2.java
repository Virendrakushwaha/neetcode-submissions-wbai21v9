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
    public void reorderList(ListNode head) {

        if(head==null)
        return ;
        //count total element

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        
        ListNode prev = null;
        ListNode curr=slow.next; 
        ListNode temp=slow.next;    //assign middle to temp 
        slow.next = null;           //break the linkedlist from middle

        while(curr!=null){
            temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        //take result list and merge into it
        ListNode firstNode = head;
        ListNode secondNode = prev;
        ListNode dummy = new ListNode(0);
        ListNode resultList = dummy;
      
        while(firstNode!=null || secondNode!=null){
            if(firstNode!=null){
                dummy.next = firstNode;
                firstNode = firstNode.next;
                dummy = dummy.next;
            }
            if(secondNode!=null){
                dummy.next = secondNode;
                secondNode = secondNode.next;
                dummy = dummy.next;
            }
        }
        
       
    }



}
