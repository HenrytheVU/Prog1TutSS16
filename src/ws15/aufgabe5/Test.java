package ws15.aufgabe5;

public class Test {

	static Knoten start = new Knoten("Bart",
			new Knoten("Homer", new Knoten("Lisa", new Knoten("Maggie", new Knoten("Marge", null)))));

	public static void main(String[] args) {
		wasTuIch(3);
	}

	public static void wasTuIch(int a) {

		Knoten b = start;
		Knoten c = start;

		int d = 1;
		while (d < a - 1) {
			b = b.getNext();
			d++;
		}
		System.out.println(b.getName());
		while (c.getNext() != null) {
			c = c.getNext();
		}
		System.out.println(c.getName());
		c.setNext(b.getNext());
		b.setNext(b.getNext().getNext());
		c.getNext().setNext(null);

		System.out.println(start);
	}

}
