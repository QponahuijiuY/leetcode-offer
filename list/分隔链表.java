class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        ListNode before = new ListNode(0);
        ListNode before_head = before;
        ListNode after = new ListNode(0);
        ListNode after_head = after;
        ListNode cur = head;
        while(cur != null){
            if (cur.val < x){
                before.next = cur;
                before = before.next;
            }else{
                after.next = cur;
                after = after.next;
            }
            cur = cur.next;
        }
        after.next = null;
        before.next = after_head.next;
        return before_head.next;

    }
}
