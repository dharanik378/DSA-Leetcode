class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        int dec=Integer.parseInt(sb.toString(),2); //to base 2
        return dec;
    }
}
