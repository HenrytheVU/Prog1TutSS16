package ws14.aufgabe3;

public class Reise {
	protected String reiseziel;
	protected double preis;
	protected int reisedauer; // reisedauer in Tagen
	public static double DEFAULTPREIS = 100.00;
	public static int DEFAULTDAUER = 7;

	public Reise(String reiseziel, double preis, int reisedauer) {
		this.reiseziel = reiseziel;
		setPreis(preis);
		setReisedauer(reisedauer);
	}// endconstructor

	public String getReiseziel() {
		return reiseziel;
	}// endmethod getReiseziel

	public void setReiseziel(String reiseziel) {
		this.reiseziel = reiseziel;
	}// endmethod setReiseziel

	public double getPreis() {
		return preis;
	}// endmethod getPreis

	public void setPreis(double preis) {
		if (preis > 0)
			this.preis = preis;
		else
			this.preis = DEFAULTPREIS;
	}// endmethod setPreis

	public int getReisedauer() {
		return reisedauer;
	}// endmethod getReisedauer

	public void setReisedauer(int reisedauer) {
		if (reisedauer > 0)
			this.reisedauer = reisedauer;
		else
			this.reisedauer = DEFAULTDAUER;
	}// endmethod setReisedauer

	@Override
	public String toString() {
		return "Reiseziel: " + this.reiseziel + "\nPreis: " + this.preis + "\nDauer: " + this.reisedauer;
	}// endmethod toString
}// endclass Reise