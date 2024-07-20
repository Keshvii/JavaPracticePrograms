package datastructure;

public class LL_SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LL_SinglyLinkedList(){
        this.size = 0;
    }

    //O(1)
    //Insert from head side
    public void insertFirst(int val){
        Node node = new Node(val);
        /*
        * Nodes in the Linked List:
        * Each node contains a value and a reference to the next node.
        * The first node is referenced by head.
        * The last node has its next reference set to null.
        * */
        node.next= head; // Link the new node to the current head//No NullPoinetrException as node.next used and node is never null
        head = node;

        if(tail==null){
            tail=head;
        }

        ++size;
    }


    //O(1)
    //Insert from tail side
    public void insertLast(int val){
        Node node = new Node(val);
//        tail.next=node; // we can't do it this way as in this stmt if tail is null(i.e. LL empty) then it will case nullpointerexception. Hence we need to handle empty String case as well as filled-one separately
//        tail = node;
//        if(head==null){
//            head = node;
//        }
//        ++size;
        if(head==null){//empty LL
            head = tail = node;
            ++size;
            return;
        }
        tail.next = node;
        tail = node;
        ++size;
    }

    //O(n)
    //insert at given index
    public void insert(int index, int val){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head; //i=0
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }


    //O(1)
    //delete first node(return node val)
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = head;
        }
        size--;
        return val;
    }

    //O(n)
    //get value of Node from index
    public Node getNode(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node node = head;
        for(int i=1; i<=index; i++){
            node = node.next;
        }
        return node;
    }

    //o(n)
    // delete last element
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node node = getNode(size-2);
        int deleteVal = tail.value;
        node.next=null;
        tail = node;
        --size;
        return deleteVal;
    }

    //O(n)
    //delete node at given index
    public int delete(int index){
        if(index<0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node node = getNode(index-1);
        int deletedVal = node.next.value;
        node.next = node.next.next;

//        Node prev = getNode(index - 1);
//        Node nodeToDelete = prev.next;
//        int deletedVal = nodeToDelete.value;
//        prev.next = nodeToDelete.next;
//
//        // Help GC by removing the next reference of the deleted node
//        nodeToDelete.next = null;

        --size;
        return deletedVal;

    }

    //O(n)
    //find using value
    public Node findNode(int value){
        Node node = head;
        while(node.next!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //O(n)
    //Display
    public void display(){
        if(this.head==null && this.tail==null){
            System.out.println("Empty linked list");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL_SinglyLinkedList ll = new LL_SinglyLinkedList();

        ll.insertFirst(22);
        ll.insertFirst(33);
        ll.insertFirst(12);
        ll.insertLast(90);
        ll.insert(2,69);
        ll.display();
        System.out.println(ll.findNode(33));
        ll.display();
    }
}
