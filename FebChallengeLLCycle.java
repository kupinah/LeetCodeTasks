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
        HashMap cop = new HashMap();
        ListNode tmp = head;
        while(tmp!=null){
            int counter = index(head, tmp);            
            if(cop.containsKey(counter)) return true;
            cop.put(counter, tmp.val);
            tmp = tmp.next;
        }
        return false;
    }
    public static int index(ListNode head, ListNode find){
        ListNode tmp = head;
        int counter =  0;
        while(!tmp.equals(find)){
            tmp = tmp.next;
            counter++;
        }
        return counter;
    }
}