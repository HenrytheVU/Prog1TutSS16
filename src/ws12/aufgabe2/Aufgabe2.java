package ws12.aufgabe2;

public class Aufgabe2 {
	// a)
	static char[] verschluesseln(char[] input, int zahl) {
		if (zahl < 0) {
			return null;
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 'A' || input[i] > 'Z') {
				return null;
			}
		}
		for (int i = 0; i < input.length; i++) {
			char buchstabe = (char) (input[i] + zahl);
			if (buchstabe > 'Z') {
				buchstabe = (char) (buchstabe - 26);
			}
			input[i] = buchstabe;
		}
		return input;
	}

	// b)
	public static void main(String[] args) {
		char[] array = verschluesseln("JAVAY".toCharArray(), 5);
		System.out.println(new String(array));
	}
}
