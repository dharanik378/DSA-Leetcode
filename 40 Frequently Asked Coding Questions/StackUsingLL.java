class Stack {
    private ListNode top;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // Push: Add element to top
    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop: Remove and return top element
    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek: Return top element without removing
    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
