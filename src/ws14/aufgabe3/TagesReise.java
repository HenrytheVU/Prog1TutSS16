package ws14.aufgabe3;

public class TagesReise extends Reise {

	private Uhrzeit abfahrt;
	private Uhrzeit ankunft;

	public TagesReise(String reiseziel, double preis, Uhrzeit abfahrt, Uhrzeit ankunft) {
		super(reiseziel, preis, 1);
		this.abfahrt = abfahrt;
		this.ankunft = ankunft;
	}

	public Uhrzeit getAbfahrt() {
		return abfahrt;
	}

	public void setAbfahrt(Uhrzeit abfahrt) {
		this.abfahrt = abfahrt;
	}

	public Uhrzeit getAnkunft() {
		return ankunft;
	}

	public void setAnkunft(Uhrzeit ankunft) {
		this.ankunft = ankunft;
	}

	public String toString() {
		return super.toString() + ", Abfahrt: " + abfahrt + ", Ankunft: " + ankunft;
	}

}
