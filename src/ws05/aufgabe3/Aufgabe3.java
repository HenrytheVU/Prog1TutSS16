package ws05.aufgabe3;

public class Aufgabe3 {

	int zaehleZeichen(Character[][] array) {
		int summe = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] != null) {
					summe++;
				}
			}
		}
		return summe;
	}

	boolean vertauscheZeilen(Character[][] array, int zeile1, int zeile2) {
		if (zeile1 >= array.length || zeile2 >= array.length) {
			return false;
		}
		Character[] platzhalter = array[zeile1];
		array[zeile1] = array[zeile2];
		array[zeile2] = platzhalter;
		return true;
	}

	char[][] einfuegeTextdokument(char[][] text1, char[][] text2, int position) {
		char[][] result = new char[text1.length + text2.length][0];
		int counter = 0;
		while (counter < position) {
			result[counter] = text1[counter];
			counter++;
		}
		while (counter < position + text2.length) {
			result[counter] = text2[counter];
			counter++;
		}
		while (counter < result.length) {
			result[counter] = text1[counter - text2.length];
			counter++;
		}
		return result;
	}
}
