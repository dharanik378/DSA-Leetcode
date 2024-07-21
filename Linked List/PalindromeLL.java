class Solution {
    public boolean isPalindrome(ListNode head) {
        //find mid

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        
        //reverse second half

        ListNode curr=mid;
        ListNode prev=null;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }

        // compare usinf left and right pointers

        ListNode right=prev; //head of right half
        ListNode left=head;

        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}
