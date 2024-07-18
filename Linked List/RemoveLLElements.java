/*
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
*/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        while(head!=null && head.val==val){
            head=head.next;;
        }
        
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null ){
            if(curr.val==val){
               if(prev!=null){
                prev.next=curr.next;
               }
            }else{
                prev=curr;
            }
            
            curr=curr.next;
        }
        return head;
    }
}
