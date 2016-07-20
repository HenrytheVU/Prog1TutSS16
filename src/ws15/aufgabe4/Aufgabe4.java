package ws15.aufgabe4;

import ws15.aufgabe3.Schliessfachtuer;

public class Aufgabe4 {

	public static void main(String[] args) {
		// 4a
		Schliessfachtuer[] array = new Schliessfachtuer[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = new Schliessfachtuer(i + 1, false);
		}

		System.out.println("ready");
		// 4b

		// Erste Schleife, entspricht den 100 Durchgängen
		// i = Durchgangsnummer
		for (int i = 1; i <= 100; i++) {

			// Zweite Schleife, das sind die 100 Schließfächer
			// j = Schließfachnummer
			for (int j = 0; j < array.length; j++) {

				// Das, was in der Aufgabe so kompliziert beschrieben wurde,
				// mit beim ersten Durchgang jede Tür,
				// beim zweiten D. jede zweite Tür, ...

				// Kann im Programm ganz einfach mit Modulo Durchgangsnummer
				// gelöst werden
				if (j % i == 0) {
					// Jetzt muss die Schließfachtür geswitcht werden
					// Immer das Gegenteil von isOffen an setOffen übergeben
					array[j].setOffen(!array[j].isOffen());

					// alternativ geht auch das etwas längere if else:
					// if(array[j].isOffen()){
					// array[j].setOffen(false);
					// } else {
					// array[j].setOffen(true);
					// }

				}

				System.out.print(array[j]);
			}
			// Nach jedem Durchgang erfolgt ein Zeilenwechsel
			System.out.println();
		}
		
		// 4 c
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].isOffen())
				counter++;
		}
		System.out.println("Anzahl offener Türen: " + counter);
		

	}
}
