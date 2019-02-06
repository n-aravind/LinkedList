public class Node {
    private String value;
    private Node reference;

    public Node(String value) {
        this.value = value;
        this.reference = null;
    }

    public Node getReference() {
        return reference;
    }

    public void setReference(Node reference) {
        this.reference = reference;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", reference=" + reference +
                '}';
    }
}
