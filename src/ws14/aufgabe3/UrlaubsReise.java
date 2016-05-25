package ws14.aufgabe3;

public class UrlaubsReise extends Reise {

	private String unterkunft;
	private TransportMittel anreise;
	private Verpflegung essen;

	public UrlaubsReise(String reiseziel, double preis, int reisedauer, String unterkunft, TransportMittel anreise,
			Verpflegung essen) {
		super(reiseziel, preis, reisedauer);
		this.unterkunft = unterkunft;
		this.anreise = anreise;
		this.essen = essen;
	}

	public String getUnterkunft() {
		return unterkunft;
	}

	public void setUnterkunft(String unterkunft) {
		this.unterkunft = unterkunft;
	}

	public TransportMittel getAnreise() {
		return anreise;
	}

	public void setAnreise(TransportMittel anreise) {
		this.anreise = anreise;
	}

	public Verpflegung getEssen() {
		return essen;
	}

	public void setEssen(Verpflegung essen) {
		this.essen = essen;
	}

	public String toString() {
		return super.toString() + ", Unterkunft: " + unterkunft + ", Anreise: " + anreise + ", Essen: " + essen;
	}

}
