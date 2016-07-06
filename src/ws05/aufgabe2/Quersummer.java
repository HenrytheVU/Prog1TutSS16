package ws05.aufgabe2;

import java.util.Scanner;

import org.omg.CosNaming.IstringHelper;

public class Quersummer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
		String line = sc.nextLine();
		long zahl = liesLongN(line);
		boolean isGueltig = false;
		long summe = 0;

		while (!isGueltig) {
			if (zahl < 0) {
				isGueltig = false;
				System.out.println("Bitte geben Sie eine gültige Zahl ein:");
				zahl = liesLongN(sc.nextLine());
			} else {
				isGueltig = true;
				while (zahl != 0) {
					long rest = zahl % 10;
					summe += rest;
					zahl = zahl / 10;
				}
			}
		}
		System.out.println("Die Quersummer ist: " + summe);
	}

	static long liesLongN(String line) {
		return Long.valueOf(line);
	}
}
