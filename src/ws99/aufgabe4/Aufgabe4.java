package ws99.aufgabe4;

public class Aufgabe4 {

	public static char[] konkatenieren(char[] feld1, char[] feld2) {
		char[] result = new char[feld1.length + feld2.length];

		for (int i = 0; i < feld1.length; i++) {
			result[i] = feld1[i];
		}

		for (int i = 0; i < feld2.length; i++) {
			result[feld1.length + i] = feld2[i];
		}
		return result;

	}
}
