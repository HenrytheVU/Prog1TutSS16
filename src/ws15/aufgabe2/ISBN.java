package ws15.aufgabe2;

import java.util.Scanner;

public class ISBN {

	// 2a
	public static boolean istISBN(String input) {
		char[] array = input.toCharArray();
		int k = 1;
		int summe = 0;
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if (c != '-') {
				summe += c * k;
				k++;
			}
		}
		if (summe % 11 == 0) {
			return true;
		}
		return false;
	}

	// 2b
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine ISBN ein: ");
		String input = sc.nextLine();
		System.out.println("Die eingebene ISBN ist: " + istISBN(input));
		sc.close();
	}
}
