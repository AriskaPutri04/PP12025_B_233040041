package Tpertemuan4;

public class NodePecahan {
	private double data;
	private NodePecahan next;

	// ** inisialisasi Atribut Node */
		public NodePecahan(double data) {
	    this.data = data;
	   }

    // ** Setter & Getter */
		public void setNext(NodePecahan next) {
		this.next = next;
	   }

		public void setData(double data) {
			this.data = data;
		   }
		
		public NodePecahan getNext() {
	    return next;
		}

		public double getData() {
	    return data;
		}
}
