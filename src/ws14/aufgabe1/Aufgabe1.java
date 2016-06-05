package ws14.aufgabe1;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "otto";
		String string2 = "lagerregal";
		String string3 = "rotor";

		System.out.println(string1 + " ist ein Palindrom: " + palindromTest(string1.toCharArray()));
		System.out.println(string2 + " ist ein Palindrom: " + palindromTest(string2.toCharArray()));
		System.out.println(string3 + " ist ein Palindrom: " + palindromTest(string3.toCharArray()));
	}
	
	// Aufgabe 1:
	public static boolean palindromTest(char[] feld) {
		
		for (int a = 0, e = feld.length - 1; a < (feld.length / 2); a++, e--) {
			if (feld[a] != feld[e]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	// alternative Lösung
	public static boolean palindromTest2(char[] feld) {
		int i = 0;
		int j = feld.length - 1;
		boolean ergebnis = true;

		while (i < feld.length/2) {
			if (feld[i] != feld[j]) {
				ergebnis = false;
			}
			
			i++;
			j--;
		}

		return ergebnis;
	}

}
