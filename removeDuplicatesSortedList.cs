/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class removeduplicatessortelist {
    public ListNode DeleteDuplicates(ListNode head) {
        ListNode tmp = head;
        if(tmp == null) return null;
        while(tmp.next != null){
            if (tmp.val == tmp.next.val) tmp.next = tmp.next.next;
            else tmp = tmp.next;
        }
        return head;
    }
}