public class Stack {
    private int height;
    private Node top;
    class Node{
        Node next;
        int value;
        Node(int value){
            this.value = value;
        }
    }
    Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height=1;
    }
    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println("Value is"+temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top Value is"+top.value);
    }
    public void getHeight(){
        System.out.println("Height is"+height);
    }
}
