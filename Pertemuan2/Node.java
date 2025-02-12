package Tpertemuan2;

public class Node {
    private int nilai;
    private Node next;

    //  inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null;  
    }

    //  Setter & Getter
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public int getNilai() {
        return this.nilai;
    }
}

