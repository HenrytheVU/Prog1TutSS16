package ws14.aufgabe4;

public class Liste {

	Knoten start = null;
	Knoten ende = null;

	public void fuegeHinzu(Knoten knoten) {
		// pruefe, ob liste leer ist
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
		// Liste leer
		if (start == null) {
			return null;
			
			// genau ein Knoten in der Liste
		} else if (start == ende) {
			Knoten temp = start;
			start = null;
			ende = null;
			return temp;
			
			// mindestens zwei Knoten
		} else {
			Knoten temp = start;
			start = start.getNext();
			return temp;
		}
	}
	
	public boolean istLeer(){
		if (ende == null){
			return true;
		} else {
			return false;
		}
		
//		return start == null;
	}
}
