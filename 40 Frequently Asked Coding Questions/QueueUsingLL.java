class Queue {
    private ListNode front; // Points to the front of the queue
    private ListNode rear;  // Points to the rear of the queue

    // Nested class for linked list nodes
    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue: Adds an element to the back of the queue
    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);

        if (rear == null) { // If queue is empty
            front = rear = newNode;
            return;
        }

        rear.next = newNode; // Link new node at the end of the queue
        rear = newNode;      // Update rear to new node
    }

    // Dequeue: Removes and returns the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int data = front.data; // Get data from the front node
        front = front.next;    // Move front to the next node

        if (front == null) { // If the queue becomes empty after dequeue
            rear = null;
        }

        return data;
    }

    // Peek: Returns the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    // isEmpty: Checks if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}
