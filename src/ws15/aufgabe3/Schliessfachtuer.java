package ws15.aufgabe3;

public class Schliessfachtuer {
	// Für dich Henry

	private int nummer;
	private boolean offen;

	public Schliessfachtuer(int nummer, boolean offen) {
		this.nummer = nummer;
		this.offen = offen;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public boolean isOffen() {
		return offen;
	}

	public void setOffen(boolean offen) {
		this.offen = offen;
	}

	public String toString() {
		if (offen) {
			return "o";
		} else {
			return "z";
		}
	}
}
