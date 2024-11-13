// RECURSIVE APPROACH
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode reversedList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedList;
    }
}

//ITERATIVE APPROACH
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextNode = current.next; // Save the next node
            current.next = previous;          // Reverse the link
            previous = current;               // Move `previous` one step forward
            current = nextNode;               // Move `current` one step forward
        }
        
        return previous; // `previous` is the new head of the reversed list
    }
}
