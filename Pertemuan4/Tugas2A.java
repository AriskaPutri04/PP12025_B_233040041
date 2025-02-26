package Tpertemuan4;

public class Tugas2A {
	public static void main(String[] args) {
		StrukturListPecahan list = new StrukturListPecahan();
		
		list.addHead(2.1);
		list.addMid(3.4, 2);
		list.addTail(4.5);
		
		System.out.println("Elemen : ");
		list.displayElement();
	}
}
