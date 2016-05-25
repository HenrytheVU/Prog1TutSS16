package ws14.aufgabe4;

public class Knoten {

	private String nachname;
	private Knoten next;

	public Knoten(String nachname, Knoten next) {
		this.nachname = nachname;
		this.next = next;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Knoten getNext() {
		return next;
	}

	public void setNext(Knoten next) {
		this.next = next;
	}

}
