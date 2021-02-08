class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class mergeTwoSortedLists {
    public static void main(String[] args){
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();
        l1.val = -9;
        l1.next = l2;
        l2.val = 3;
        //l2.next = l3;
        l3.val = 5;
        l3.next = l4;
        l4.val = 7;
        //l4.next = l5;
        //l5.val = 4;
        ListNode head = sort(l1, l3);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode sort(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 != null && l2 == null) return l1;
        if(l1 == null && l2 != null) return l2;
        ListNode first = new ListNode();
        boolean flag = true;
        boolean firEq = true;
        if(l1.val != l2.val) firEq = false;
        ListNode res = new ListNode(); 
        while(l1 != null || l2 != null){ 
            ListNode temp = new ListNode();
            if(l1 != null && l2 != null && l1.val < l2.val){
                res.val = l1.val;
                l1 = l1.next;
            }
            else if(l1 != null && l2 != null && l2.val < l1.val){
                res.val = l2.val;
                l2 = l2.next;
            } 
            else if(l1 != null && l2 != null && l1.val == l2.val){
                res.val = l1.val;
                if(firEq)
                    first = res;
                l1 = l1.next;
                res.next = temp;
                res = res.next;
                res.val = l2.val;
                temp = new ListNode();
                l2 = l2.next;
            }
            else if(l1 == null && l2 != null) {
                res.val = l2.val;
                l2 = l2.next;
            }
            else if(l1 != null && l2 == null){
                res.val = l1.val;
                l1 = l1.next;
            }
            if(flag) 
                if(!firEq) first = res;
            if(l1 != null || l2 != null){
                res.next = new ListNode();
                res = res.next;
            }
            firEq = false;
            flag = false;
        }
        return first;
    }
}
