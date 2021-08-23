package SimpleLinkedList;

public class test {
    public static void main(String[] args) {
        System.out.println("---Test---");
        LinkedList ll = new LinkedList(10);
        System.out.println("-");
        ll.addFirst(11);
        ll.printList();
        System.out.println("-");
        System.out.println();
        System.out.println();
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.add(7,4);
        ll.add(6,3);
        ll.printList();
    }
}
