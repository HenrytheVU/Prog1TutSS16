package ws05;

import java.util.Scanner;

public class Quersumme {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int eingabe;
		int quersumme = 0;
		
		do {
		System.out.println("Bitte ganze Zahl (>= 0) eingeben: ");
		eingabe = scanner.nextInt();
		
		} while (eingabe < 0);
		
		scanner.close();
		
		// Berechnung der Quersumme:
		do {
			quersumme += eingabe % 10;
			eingabe = eingabe / 10;
			
		} while (eingabe > 0);
		
		System.out.println("Die Quersumme lautet: " + quersumme);
		
	}

}
