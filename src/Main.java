public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(5));

        myLinkedList.add("Aravind");
        myLinkedList.add("Gil");
        myLinkedList.add("Cobol");
        myLinkedList.add("Java");
        myLinkedList.add("Raja");
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(5));
        myLinkedList.delete(3);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(5));
    }
}
