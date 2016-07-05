package ss14.aufgabe5;

import java.util.Scanner;

public class TestGebrauchtwage {

	public static void main(String[] args) {

		Gebrauchtwagen[] gebrauchteAutos_ref = new Gebrauchtwagen[200];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < gebrauchteAutos_ref.length; i++) {
			System.out.print("Typ: ");
			String typ = sc.next();
			
			System.out.print("Tachostand: ");
			int tachostand = sc.nextInt();
			
			System.out.print("Verbrauch: ");
			double verbrauch = sc.nextDouble();
	
			System.out.print("Einkaufspreis: ");
			double einkaufspreis = sc.nextDouble();

			gebrauchteAutos_ref[i] = new Gebrauchtwagen(typ, tachostand, verbrauch, einkaufspreis);

		}
		
		sc.close();
	}

}
