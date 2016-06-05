package ws14.aufgabe5;

public class BruchTest {

	public static void main(String[] args) {
		
		Bruch a = new Bruch(2,3);
		Bruch b = new Bruch(3,4);
		
		System.out.println("Bruch " + a + " mal " + b);
		System.out.println(Bruch.multipliziereBrueche(a, b));
		
		System.out.println("Bruch " + a + " plus " + b);
		System.out.println(Bruch.addiereBrueche(a, b));
		
		a.multipliziereMitBruch(b);
		System.out.println(a);

	}

}
