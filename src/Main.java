public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(5));

        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        System.out.println(myLinkedList.size());

        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(5));

    }
}
