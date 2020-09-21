import TH.LinkedListBasic;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasicTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedListBasic ll = new LinkedListBasic(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }

}