class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class AddTwoN { 
    public static void main(String[] args){
        ListNode l1 = new ListNode();
        ListNode la = new ListNode();
        ListNode lb= new ListNode();
        ListNode lc = new ListNode();
        ListNode ld = new ListNode();
        ListNode le = new ListNode();
        ListNode lf= new ListNode();
        ListNode lg = new ListNode();
        ListNode lh= new ListNode();
        ListNode li = new ListNode();
        l1.val = 9;
        l1.next = la;
        la.val = 9;
        la.next = lb;
        lb.val = 9;
        lb.next = lc;
        lc.val = 9;
        lc.next = ld;
        ld.val = 9;
        ld.next = le;
        le.val = 9;
        le.next = lf;
        lf.val = 9;

        ListNode l2 = new ListNode();
        l2.val = 9;
        l2.next = lg;
        lg.val = 9;
        lg.next = lh;
        lh.val = 9;
        lh.next = li;
        li.val = 9;
        ListNode tmp = addTwoNumbers(l1, l2);
        while(tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode();
        int sum = 0;
        sum = l1.val + l2.val;
        if(sum < 10){
            first.val = sum;
            sum = 0;
        } 
        else{
            first.val = sum%10;
            sum = sum/10;
        }
        if(l1.next == null && l2.next == null) return first;
        ListNode res = new ListNode();
        first.next = res;
        l1 = l1.next;
        l2 = l2.next;
        
        while(l1 != null || l2 != null){
            if(l1 == null) l1 = new ListNode();
            if(l2 == null) l2 = new ListNode();
            sum += l1.val + l2.val;

            if(sum < 10){
                res.val = sum;
                sum = 0;
            } 

            else{
                res.val = sum%10;
                sum = sum/10;
            }
            if(l1.next != null || l2.next != null){
                res.next = new ListNode();
                res = res.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(sum != 0){
            res.next = new ListNode();
            res = res.next;
            res.val = sum;
        }
        return first; 
    }
}