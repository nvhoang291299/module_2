package SS10_stack_and_queue.circleLinkedList;

public class CircleLinkedList {
    Node rear;
    public CircleLinkedList(Node rear){
        this.rear = rear;
        if (this.rear != null){
            this.rear.next = this.rear;
        }
    }
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Node front;
        Node rear;
    }
     public class Solution{
         void enQueue(Queue q, int value){

        }
        void deQueue(Queue q){

        }
         void displayQueue(Queue q){

         }
    }

    public static void main(String[] args) {

    }
}
