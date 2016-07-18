package ws13.aufgabe3;

public class Aufgabe3 {

	static int[] addiere(int[] a, int[] b) {
		int zahl1 = 0;
		int zahl2 = 0;
		int faktor = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			zahl1 = zahl1 + a[i] * faktor;
			zahl2 = zahl2 + b[i] * faktor;
			faktor *= 10;
		}
		int summe = zahl1 + zahl2;

		int temp = summe;
		int counter = 0;
		while (temp != 0) {
			temp /= 10;
			counter++;
		}

		int[] result = new int[counter];

		for (int i = result.length - 1; i >= 0; i--) {
			result[i] = summe % 10;
			summe /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array1 = { 5, 2, 3 };
		int[] array2 = { 3, 2, 1 };

		for (int i : addiere(array1, array2)) {
			System.out.print(i);
		}
	}

	int[] addiere1(int[] a, int[] b) {
		int[] result = new int[a.length];
		boolean uebertrag = false;

		for (int i = a.length - 1; i >= 0; i--) {
			int zwischenergebnis = a[i] + b[i];

			if (uebertrag) {
				zwischenergebnis++;
				uebertrag = false;
			}

			if (zwischenergebnis > 9) {
				zwischenergebnis = zwischenergebnis - 10;
				uebertrag = true;
			}

			result[i] = zwischenergebnis;

		}

		if (uebertrag) {
			int[] result2 = new int[a.length + 1];
			result2[0] = 1;
			for (int i = 1; i < result2.length; i++) {
				result2[i] = result[i - 1];
			}
			return result2;
		}

		return result;
	}

}
