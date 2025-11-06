public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }
    public void printDoublyLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head Value is: "+head.value);
    }
    public void getTail(){
        System.out.println("Tail value is: "+tail.value);
    }
    public void getLength(){
        System.out.println("Length is: "+length);
    }

}
