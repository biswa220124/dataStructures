public class testLinkedList {
    public static void main(String[] args) {
        myLinkedList LL1 = new myLinkedList(5);
        LL1.append(6); LL1.append(4);
        LL1.insert(1,9);
        System.out.println("Original Linked List");
        LL1.printLinkedList();
        System.out.println();
        System.out.println("Removing Linked List at index 2");
        LL1.remove(2);
        LL1.printLinkedList();

    }
}
