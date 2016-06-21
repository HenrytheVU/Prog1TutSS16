package ws12.aufgabe1;

public class Aufgabe1 {

	static double istDifferenz(double zahl1, double zahl2) {
		if (zahl1 < zahl2) {
			return zahl2 - zahl1;
		} else {
			return zahl1 - zahl2;
		}
	}

	static double istDifferenz2(double z1, double z2) {
		double result = z1 - z2;
		if (result < 0) {
			return result * -1;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(istDifferenz(2.1, 2.1));
		System.out.println(istDifferenz(2.1, 3.5));
	}

}
