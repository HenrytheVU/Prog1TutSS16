package ws15.aufgabe1;

public class Aufgabe1 {

	public static double berechneProzent(int zahl, int prozent) {
		if (zahl < 0 || prozent < 0) {
			return -1.0;
		}
		return  zahl / 100.0 * prozent;
	}
	
	public static void main(String[] args) {
		System.out.println(berechneProzent(250, 10));
		System.out.println(berechneProzent(250, -10));
		System.out.println(berechneProzent(30, 5));
	}
}
