package Tpertemuan4;

public class Node {
	private int data;
	private Node next;

	// ** inisialisasi Atribut Node */
		public Node(int data) {
	    this.data = data;
		this.next = null;  
	   }

    // ** Setter & Getter */
		public void setNext(Node next) {
		this.next = next;
	   }

		public void setData(int data) {
			this.data = data;
		   }
		
		public Node getNext() {
	    return next;
		}

		public int getData() {
	    return data;
		}
}
