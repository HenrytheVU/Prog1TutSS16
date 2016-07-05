package ss14;

public class Aufgabe4 {

	// a) 10 Punkte
	public char[][] ersetzeZeichen(char[][] feld, char alt, char neu) {

		for (int zeile = 0; zeile < feld.length; zeile++) {

			if (feld[zeile] != null) {

				for (int spalte = 0; spalte < feld[zeile].length; spalte++) {

					if (feld[zeile][spalte] == alt) {
						feld[zeile][spalte] = neu;
					}

				}
			}
		}

		return feld;
	}
	
	
	public char[][] dreheDokument(char[][] feld) {

		for (int zeile = 0; zeile < feld.length; zeile++) {
			if (feld[zeile] != null) {
				for (int letztes = feld[zeile].length - 1, erstes = 0; erstes < feld[zeile].length / 2; erstes++, letztes--) {
					char temp = feld[zeile][erstes];
					feld[zeile][erstes] = feld[zeile][letztes];
					feld[zeile][letztes] = temp;
				}
			}
		}

		return feld;
	}
	
	// b) 16 Punkte
	public char[][] dreheDok2(char[][] feld) {

		for (int z = 0; z < feld.length; z++) {
			if (feld[z] != null) {
				char[] zeile = feld[z];

				for (int a = 0, e = zeile.length - 1; a < zeile.length / 2; a++, e--) {
					char temp = zeile[a];
					zeile[a] = zeile[e];
					zeile[e] = temp;
				}
			}
		}
		return feld;
	}

}
