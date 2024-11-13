/*
If skipA is null, it means the pointer has reached the end of list A. So, we reset skipA to headB (start of list B).
Similarly, if skipB is null, it means the pointer has reached the end of list B. So, we reset skipB to headA (start of list A).
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Initialize two pointers for the two lists
        ListNode skipA = headA;
        ListNode skipB = headB;

        // Loop until both pointers meet
        while (skipA != skipB) {
            // If skipA reaches the end of List A, reset to head of List B
            if (skipA == null) {
                skipA = headB;
            } else {
                skipA = skipA.next;
            }

            // If skipB reaches the end of List B, reset to head of List A
            if (skipB == null) {
                skipB = headA;
            } else {
                skipB = skipB.next;
            }
        }

        // Return the intersection node (or null if no intersection)
        return skipA;
    }
}
