public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printDoublyLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head Value is: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail value is: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length is: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }
        length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

        } else {
            temp = tail;
            for (int j = length - 1; j > index; j--) {
                temp = temp.prev;
            }
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            return true;
        }
        return false;
    }
    public boolean inset(int index, int value){
        Node newNode = new Node(value);
        if(index<0 || index>length) return false;
        if(index==0) prepend(value);
        if(index==length-1) append(value);

        else{
            Node pre = get(index-1);
            Node post = pre.next;
            newNode.prev = pre;
            newNode.next = post;
            pre.next = newNode;
            post.prev = newNode;

        }
        length++;
        return true;
    }
    public Node remove(int index){
        if(index<0|| index>=length) return null;
        if(index==0) removeFirst();
        if(index==length-1) removeLast();
        Node before = get(index-1);
        Node after = get(index+1);
        Node present = get(index);
        present.prev =null;
        present.next = null;
        before.next = after;
        after.prev = before;
        length--;
        return present;
    }
}
