class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        Stack<ListNode> stack = new Stack();
        ListNode cur = head;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            if(head.val != stack.pop().val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}

