public class MyLinkedList {

    private Node head;

    public void add(String value){

        Node newNode = new Node(value);

        if (this.head == null){
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.getReference() != null){
                last = last.getReference();
            }
            last.setReference(newNode);
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    public int size() {
        if (this.head == null){
            return 0;
        }
        int i =1;
        Node last = this.head;
        while (last.getReference() != null){
            last = last.getReference();
            i++;
        }
        return i;

    }

    public String get(int i) {
        if (this.head == null){
            return "Linked List is Empty";
        }else if (i == 0){
            return "Invalid Index: List Index starts from 1";
        }
        if (i <= this.size()){
            int j =1;
            Node last = this.head;

            do{
                if (i == j){
                    return "Value at the given index is " + last.getValue();
                }
                last = last.getReference();
                j++;
            }while (j <= this.size());
        }
        return "Invalid Index:  Out of Bounds";
    }
}
