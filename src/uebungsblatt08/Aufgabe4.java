package uebungsblatt08;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Aufgabe4 {

	public static void main(String[] args) {
		String[] sentences = new String[20];
		sentences[0] = "HAUS";
		sentences[1] = "PROGRAMMIEREN";
		sentences[2] = "FHWS";
		sentences[3] = "ECOMMERCE";
		sentences[4] = "WINF";
		sentences[5] = "KATZE";
		sentences[6] = "MUSCHI";
		sentences[7] = "AKOHOL";
		sentences[8] = "BIER";
		sentences[9] = "EM";
		sentences[10] = "WM";
		sentences[11] = "DEUTSCHLAND";
		sentences[12] = "BAUM";
		sentences[13] = "PENIS";
		sentences[14] = "POPEL";
		sentences[15] = "POPO";
		sentences[16] = "ARSCH";
		sentences[17] = "BOOTY";
		sentences[18] = "TWERK";
		sentences[19] = "NICKIMINAJ";

		char[] sentence = getRandomSentence(sentences);
		char[] solution = fillWithUnderscores(sentence);

		int counter = 1;
		Scanner sc = new Scanner(System.in);

		while (counter <= 15 && !isCorrect(solution)) {
			System.out.println(counter + ". Versuch: " + new String(solution));
			String input = sc.nextLine().toUpperCase();
			char charInput = input.charAt(0);
			checkInput(charInput, sentence, solution);
			counter++;
		}

		if (isCorrect(solution)) {
			System.out.println("Glückwunsch! Sie haben gewonnen!");
		} else {
			System.out.println("Oh Nein! Verloren!");
		}

	}

	static void checkInput(char input, char[] sentence, char[] solution) {
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i] == input) {
				solution[i] = input;
			}
		}
	}

	static boolean isCorrect(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_') {
				return false;
			}
		}
		return true;
	}

	static char[] fillWithUnderscores(char[] array) {
		char[] result = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = '_';
		}
		return result;
	}

	static char[] getRandomSentence(String[] array) {
		int randInt = ThreadLocalRandom.current().nextInt(0, array.length);
		return array[randInt].toCharArray();
	}

}
