public class MyLinkedList {

    private Node head;
    private int size = 0;
    private Node lastNode;

    public void add(String value) {

        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            this.lastNode.setReference(newNode);
        }
        this.lastNode = newNode;
        size++;
    }


    public int size() {
        return size;
    }

    private Node getNodeAtReference(int i){
        Node node = this.head;
        if (i <= size) {
            int j = 1;
            do {
                if (i == j) {
                    break;
                }
                node = node.getReference();
                j++;
            } while (j <= this.size());
        }
        return node;
    }

    public String get(int i) {
        if (this.head == null) {
            return "Linked List is Empty";
        } else if (i == 0) {
            return "Invalid Index: List Index starts from 1";
        } else if ( i > this.size) {
            return "Invalid Index:  Out of Bounds";
        } else {
            return "Value at the given index is " + getNodeAtReference(i).getValue();
        }
    }

    public void delete(int i) {
        if (i <= 0 || i > this.size){
            return;
        }
        else if (i == 1 && size == 1){
            this.head = null;
            this.lastNode = null;
        }
        else if (i == 1 && i < size){
            this.head = this.head.getReference();
        }
        else if (i == size){
            getNodeAtReference(i-1).setReference(null);
            lastNode = getNodeAtReference(i-1);
        }
        else {
            getNodeAtReference(i-1).setReference(getNodeAtReference(i+1));
        }
        size--;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
