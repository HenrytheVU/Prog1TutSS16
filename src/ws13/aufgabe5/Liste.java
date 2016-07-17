package ws13.aufgabe5;

public class Liste {

	private Knoten start;

	public Liste(Knoten start) {
		this.start = start;
	}

	public Knoten getStart() {
		return start;
	}

	public void setStart(Knoten start) {
		this.start = start;
	}

	public String[] toArray() {
		int length = 0;
		Knoten temp = start;
		
		// erstmal die Anzahl der Knoten ermitteln
		while (temp != null) {
			length++;
			temp = temp.getNext();
		}
		String[] result = new String[length];
		
		// temp wieder auf Anfang gesetzt
		temp = start;
		for (int i = 0; i < result.length; i++) {
			result[i] = temp.getName();
			temp = temp.getNext();
		}
		return result;
	}

	// main-Methode zum Testen
	public static void main(String[] args) {
		Liste list = new Liste(new Knoten("K1", new Knoten("K2", new Knoten("K3", null))));
		for (String s : list.toArray()) {
			System.out.println(s);
		}
	}

}
