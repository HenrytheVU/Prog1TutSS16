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
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j += i) {
				if (array[j].isOffen() == false) {
					array[j].setOffen(true);
				} else {
					array[j].setOffen(false);
				}
			}
			System.out.print(array[i]);
		}

	}
}
