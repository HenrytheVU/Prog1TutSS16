package ws99.aufgabe1;

import java.util.Scanner;

public class PositiveNegativ {

	// Ctrl + Shift + F

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int negativCounter = 0;
		int positivCounter = 0;
		int input;

		System.out.println("Bitte ganze Zahl eingeben:");
		input = sc.nextInt();

		while (input != 0) {
			if (input > 0) {
				positivCounter++;
			} else if (input < 0) {
				negativCounter++;
			}
			System.out.println("Bitte ganze Zahl eingeben:");
			input = sc.nextInt();
		}
		sc.close();
		System.out.println("Es wurden " + positivCounter + " positive Zahlen eingegeben.");
		System.out.println("Es wurden " + negativCounter + " negative Zahlen eingegeben.");
	}
}
