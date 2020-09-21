package bt;

public class MyQueue {
    public static class Node {
        public int data;
        public Node next;
    }

    public static class Queue {
        public Node front;
        public Node rear;
    }

    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.next = temp;
        }
        q.rear = temp;
        q.rear.next = q.front;
    }

    public static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return Integer.MAX_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.next;
            q.rear.next = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.next != q.front){
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
    }
}

class Test{
    public static void main(String[] args) {
        MyQueue.Queue queue = new MyQueue.Queue();
        queue.front = queue.rear = null;

        MyQueue.enQueue(queue, 5);
        MyQueue.enQueue(queue, 10);
        MyQueue.enQueue(queue, 15);

        MyQueue.displayQueue(queue);

        System.out.print("\nXóa giá trị: " + MyQueue.deQueue(queue));
        System.out.print("\nXóa giá trị: " + MyQueue.deQueue(queue)+"\n");

        MyQueue.displayQueue(queue);

        MyQueue.enQueue(queue, 20);
        MyQueue.enQueue(queue, 25);

        System.out.println();
//        System.out.println("\n"+"GT: " + Integer.MAX_VALUE);
        MyQueue.displayQueue(queue);
    }
}

