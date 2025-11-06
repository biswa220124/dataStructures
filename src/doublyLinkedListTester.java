public class doublyLinkedListTester {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList(8);
        DLL.printDoublyLinkedList();
        DLL.getLength();
        DLL.getHead();
        DLL.getTail();
        DLL.append(9);
        DLL.printDoublyLinkedList();
        DLL.removeLast();
        DLL.printDoublyLinkedList();
        DLL.prepend(10);
        DLL.printDoublyLinkedList();
    }
}
