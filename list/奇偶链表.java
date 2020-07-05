class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode jcur = head;
        ListNode ocur = head.next;
        ListNode oend = ocur;
        while(ocur != null && ocur.next != null){
            jcur.next = ocur.next;
            jcur = jcur.next;

            ocur.next = jcur.next;
            ocur = ocur.next;
        }
        jcur.next = oend;
        return head;

    }
}
