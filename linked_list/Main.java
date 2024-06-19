import java.net.StandardSocketOptions;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);   // new keyword invokes class linked list constructor.
                                                             // Here, myLinkedList is a variable of type LinkedList

        myLinkedList.makeEmpty();                           // making the linked list empty to append.


        myLinkedList.append(2);                             // to append node with value 2
        myLinkedList.append(3);                             // to append node with value 3


        //Current linked list= 2,3
//        System.out.println(myLinkedList.removeLast().value); //Current linked list= 2. output is 3
//        System.out.println(myLinkedList.removeLast().value); //Current linked list= empty, output is 2
//        System.out.println(myLinkedList.removeLast()); // Current linked list= empty, output=null





        // appending for prepend example
        myLinkedList.append(2);
        myLinkedList.append(3);

        //prepend function call
        myLinkedList.prepend(3);


        //removeFirst()
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.get(1).value);


        myLinkedList.set(1,4);


        myLinkedList.insert(2,8);
        myLinkedList.remove(3);
        myLinkedList.reverse();


//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();



        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

}

