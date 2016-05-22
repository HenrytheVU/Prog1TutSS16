package ws15.aufgabe5;

public class Knoten {

	private String name;
	private Knoten next;

	public Knoten(String name, Knoten next) {
		this.name = name;
		this.next = next;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Knoten getNext() {
		return next;
	}

	public void setNext(Knoten next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Knoten [name=" + name + ", next=" + next + "]";
	}

}
