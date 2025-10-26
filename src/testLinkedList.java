public class testLinkedList {
    public static void main(String[] args) {
        myLinkedList LL1 = new myLinkedList(5);
      LL1.prepend(6);
      LL1.append(8);
        System.out.print("Original Linked List :");
        LL1.printLinkedList();
        LL1.setValue(1,45);
        LL1.printLinkedList();


    }
}
