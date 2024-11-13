/*
If skipA is null, it means the pointer has reached the end of list A. So, we reset skipA to headB (start of list B).
Similarly, if skipB is null, it means the pointer has reached the end of list B. So, we reset skipB to headA (start of list A).
*/
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
