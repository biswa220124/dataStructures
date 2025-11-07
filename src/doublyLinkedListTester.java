public class doublyLinkedListTester {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList(8);
        DLL.append(5);
        DLL.append(9);
        DLL.append(3);
        DLL.append(16);
        DLL.printDoublyLinkedList();
        System.out.println();
        System.out.println("Value is"+ DLL.get(3).value);
    }
}
