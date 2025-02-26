package Tpertemuan4;

public class Tugas2B {
	public static void main(String[] args) {
		StrukturListPecahan list = new StrukturListPecahan();
		
		list.addHead(3.4);
        list.addMid(2.1, 2);
        list.addMid(1.1, 3);
        list.addMid(4.5, 4);
        list.addTail(5.5);
        
        System.out.println("Elemen : ");
		list.displayElement();
	}
}
