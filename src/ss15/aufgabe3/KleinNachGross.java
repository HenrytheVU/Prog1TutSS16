package ss15.aufgabe3;

public class KleinNachGross {

	// 3a
	public static int kleinNachGroß(char[][] input) {
		int counter = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				char c = input[i][j];
				// Methode istKleinbuchstabe ist unten definiert
				if (istKleinBuchstabe(c)) {
					// minus 32, um die Kleinbuchstaben zu bekommen
					c = (char) (c - 32);
					// c ist jetzt ein Großbuchstabe und wieder in das Feld
					// stecken
					input[i][j] = c;
					counter++;
				}
			}
		}
		return counter;
	}

	static boolean istKleinBuchstabe(char c) {
		return c >= 'a' && c <= 'z';
	}

	// 3b
	public static void main(String[] args) {
		char[][] input = { { 'a', 'b' }, { 'c' }, { 'd', 'e' } };
		
		// 3a testen
		System.out.println(kleinNachGroß(input));
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(new String(input[i]));
		}
	}
}
