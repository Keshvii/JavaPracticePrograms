package datastructure;

public class LL_CircularLinkedList {
    private Node head;
    private Node tail;

    public LL_CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    //check
    public void delete(int val){
//        Node node = head;
//        if(node == null){
//            return;
//        }
//        if(node.value == val){//node to be deleted is head node
//            head = head.next;
//            tail.next = head;
//            return;
//        }
//
//        do{
//            Node n = node.next;
//            if(n.value==val){
//                node.next = n.next;
//                break;
//            }
//            node = node.next;
//        }while(node!=head);
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }


    public void display(){
        if(this.head==null && this.tail==null){
            System.out.println("Empty linked list");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LL_CircularLinkedList cll = new LL_CircularLinkedList();
        cll.insert(4);
//        cll.insert(5);
//        cll.insert(6);
        cll.delete(4);
        cll.display();
    }
}
