public class queue {
    private int length;
    private Node first;
    private Node last;

    class Node{
        Node next;
        int value;
        Node(int value){
            this.value =value;
        }

    }
    queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length=1;
    }
    public void printQueue(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getFirst(){
        System.out.println("First Value is"+first.value);
    }
    public void getLast(){
        System.out.println("Last Value is"+last.value);
    }
}
