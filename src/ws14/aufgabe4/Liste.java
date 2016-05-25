package ws14.aufgabe4;

public class Liste {

	Knoten start = null;
	Knoten ende = null;

	public void fuegeHinzu(Knoten knoten) {
		// prüfe, ob liste leer ist
		if (start == null) {
			start = knoten;
			ende = knoten;
		} else {
			// wenn liste belegt ist, dann am knoten am Ende hinzufügen
			ende.setNext(knoten);
			// ende ist jetzt das zuletzthinzugefügte Element
			ende = knoten;
		}
	}

	public Knoten entferneErstenKnoten() {
		if (start == null) {
			return null;
		} else if (start == ende) {
			Knoten temp = start;
			start = null;
			ende = null;
			return temp;
		} else {
			Knoten temp = start;
			start = start.getNext();
			return temp;
		}
	}
}
