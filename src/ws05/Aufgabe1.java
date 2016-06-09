package ws05;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A = " + istHexZiffer('A'));
		System.out.println("2 = " + istHexZiffer('2'));
		System.out.println("f = " + istHexZiffer('f'));
		System.out.println("X = " + istHexZiffer('X'));
		System.out.println("| = " + istHexZiffer('|'));
	}
	
	public static boolean istHexZiffer (char c) {
		if ((c >= '0' && c <= '9')||(c >= 'a' && c <= 'f')||(c >= 'A' && c <= 'F')){
			return true;
		} else {
			return false;
		}
	}

}
