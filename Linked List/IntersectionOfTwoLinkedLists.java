public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode skipA=headA;
        ListNode skipB=headB;

        while(skipA!=skipB){
            if(skipA==null){
                skipA=headA;
            }else{
                skipA=skipA.next;
            }
            if(skipB==null){
                skipB=headB;
            }else{
                skipB=skipB.next;
            }
        
        }
        return skipA;

    }
}
