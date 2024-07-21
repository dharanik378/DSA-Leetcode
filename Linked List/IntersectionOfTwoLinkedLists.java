/*The logic behind this approach is that both pointers will traverse both lists entirely. 
When they reach the end of one list, they start over from the beginning of the other list. 
By the time they meet at the intersection, they will have skipped the same number of nodes. 
This guarantees that they will meet at the intersection point, or both will reach the end (null) 
at the same time if there is no intersection.*/

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
