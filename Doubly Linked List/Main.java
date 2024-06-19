// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.append(4);
        myDLL.prepend(5);
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast());

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();

//        System.out.println(myDLL.get(1).value);
//        System.out.println(myDLL.get(2).value);
        myDLL.set(1,2);
        myDLL.insert(2,6);
        myDLL.remove(2);
        myDLL.printList();
    }
}