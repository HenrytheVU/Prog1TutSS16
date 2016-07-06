package uebungsblatt08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Aufgabe41 {

	public static void main(String[] args) {
		String[] sentences = new String[20];
		sentences[0] = "TUTOR";
		sentences[1] = "PROG";
		sentences[2] = "PFLANZE";
		sentences[3] = "ABSCHLUSS";
		sentences[4] = "JAVA";
		sentences[5] = "HTML";
		sentences[6] = "CSS";
		sentences[7] = "TUTORIUM";
		sentences[8] = "LAPTOP";
		sentences[9] = "COMPUTER";
		sentences[10] = "TASTATUR";
		sentences[11] = "GRAFIKKARTE";
		sentences[12] = "MAUS";
		sentences[13] = "LAUTSPRECHER";
		sentences[14] = "CLOUD";
		sentences[15] = "STUDENTEN";
		sentences[16] = "FRAUEN";
		sentences[17] = "MAENNER";
		sentences[18] = "TOILETTE";
		sentences[19] = "WASSER";

		char[] randSentence = getRandomSentence(sentences);
		char[] solution = new char[randSentence.length];

		fillArrayWithUnderscore(solution);

		int numberOfTrys = 1;
		Scanner sc = new Scanner(System.in);

		while (numberOfTrys <= 15 && !isCorrect(solution)) {
			System.out.println(numberOfTrys + ". Versuch: " + new String(solution));
			String sInput = sc.nextLine().toUpperCase();
			if (!checkCharInput(sInput.charAt(0), randSentence, solution)) {
				numberOfTrys++;
			}
		}
		sc.close();
		if (isCorrect(solution)) {
			System.out.println("Sie haben gewonnen! Das Wort ist: " + new String(randSentence));
		} else {
			System.out.println("Sie haben verloren! Das Wort ist: " + new String(randSentence));
		}
	}

	public static boolean isCorrect(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_') {
				return false;
			}
		}
		return true;
	}

	public static boolean checkCharInput(char input, char[] sentence, char[] solution) {
		boolean result = false;
		for (int i = 0; i < sentence.length; i++) {
			if (input == sentence[i]) {
				result = true;
				solution[i] = input;
			}
		}
		return result;
	}

	public static void fillArrayWithUnderscore(char[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = '_';
		}
	}

	public static char[] getRandomSentence(String[] array) {
		int randInt = ThreadLocalRandom.current().nextInt(0, array.length);
		return array[randInt].toCharArray();
	}

}
