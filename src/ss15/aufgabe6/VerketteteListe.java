package ss15.aufgabe6;

public class VerketteteListe {

	private Knoten start;

	public VerketteteListe() {
		this.start = null;
	}

	public VerketteteListe(Knoten start) {
		this.start = start;
	}

	public boolean tauscheAnfangUndEnde() {

		// suche nach Ende und Laenge ermitteln
		int length = 0;
		Knoten ende = start;
		while (ende.getNext() != null) {
			ende = ende.getNext();
			length++;
		}

		// falls die Liste weniger als 2 Knoten hat
		if (length <= 2) {
			return false;
		}

		// suche nach vorletzten Knoten
		Knoten vorletzterKnoten = start;
		while (vorletzterKnoten.getNext().getNext() != null) {
			vorletzterKnoten = vorletzterKnoten.getNext();
		}

		// start erstmal zwischenspeichern
		Knoten temp = start;

		// Ende nach vorne ziehen
		ende.setNext(start.getNext());
		start = ende;

		// Start nach hinten
		vorletzterKnoten.setNext(temp);
		temp.setNext(null);

		return true;
	}

	public Knoten getStart() {
		return start;
	}

	public void setStart(Knoten start) {
		this.start = start;
	}

	// toString für Testzwecke
	public String toString() {
		return start.toString();
	}

	// Main zum Testen
	public static void main(String[] args) {
		Knoten aaron = new Knoten("Aaron");
		Knoten cool = new Knoten("Cool");
		Knoten hot = new Knoten("Hot");
		Knoten zoll = new Knoten("Zoll");
		aaron.setNext(cool);
		cool.setNext(hot);
		hot.setNext(zoll);

		VerketteteListe liste = new VerketteteListe(aaron);
		System.out.println("--- Vor dem Tauschen: ");
		System.out.println(liste);

		System.out.println("----------------------------");
		
		
		System.out.println("Tausche erfolgreich? " + liste.tauscheAnfangUndEnde());

		System.out.println("--- Nach dem Tauschen: ");
		// nach dem Tauschen:
		System.out.println(liste);

	}

}
