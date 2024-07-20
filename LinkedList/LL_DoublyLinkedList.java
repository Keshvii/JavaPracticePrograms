package datastructure;

public class LL_DoublyLinkedList {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        if(head==null){
            //insertFirst(val);
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        node.next = null;
        node.prev = temp;
        temp.next = node;
    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while (node != null){
            last = node;
            node=node.next;
        }

        //print
        while (last != null){
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.println("Start");
    }


    //O(n)
    //find using value
    public Node findNode(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //insert after particular value
    public void insertAfter(int after, int val){
        Node p = findNode(after);

        if(p==null){
            System.out.println("Node doesn't exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

    }


    public void display(){
        if(this.head==null){
            System.out.println("Empty linked list");
            return;
        }
        Node node = head;
        while (node != null){
            System.out.print(node.value + "->");
            node=node.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LL_DoublyLinkedList dll = new LL_DoublyLinkedList();
//        dll.insertFirst(3);
//        dll.insertFirst(4);
//        dll.insertFirst(8);
        dll.insertLast(5);
        dll.insertAfter(5, 33);
        dll.display();
    }

}
