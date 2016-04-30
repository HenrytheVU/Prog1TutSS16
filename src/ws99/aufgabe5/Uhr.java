package ws99.aufgabe5;

public class Uhr {

	private int std;
	private int min;
	private int sek;

	public Uhr(int std, int min, int sek) {
		if ((std >= 0 && std <= 23) && (min >= 0 && min <= 59) && (sek >= 0 && sek <= 59)) {
			this.std = std;
			this.min = min;
			this.sek = sek;
		} else {
			this.std = 12;
			this.min = 0;
			this.sek = 0;
		}
	}

	public int getStd() {
		return std;
	}

	public int getMin() {
		return min;
	}

	public int getSek() {
		return sek;
	}

	public void setUhr(int std, int min, int sek) {
		if ((std >= 0 && std <= 23) && (min >= 0 && min <= 59) && (sek >= 0 && sek <= 59)) {
			this.std = std;
			this.min = min;
			this.sek = sek;
		} else {
			System.out.println("Ungültige Eingabe!");
		}
	}

	public void naechsteSek() {
		this.sek++;
		if (sek == 60) {
			this.sek = 0;
			this.min++;
		}
		if (this.min == 60) {
			this.min = 0;
			this.std++;
		}
		if (this.std == 24) {
			this.std = 0;
		}
	}

}
