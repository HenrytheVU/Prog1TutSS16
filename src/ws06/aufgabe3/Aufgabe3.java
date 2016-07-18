package ws06.aufgabe3;

public class Aufgabe3 {

	double potenzieren(double a, int b) {
		if (b == 0) {
			return 1;
		}
		if (b < 0) {
			b = b * -1;
			double result = a;
			for (int i = 1; i <= b; i++) {
				result *= a;
			}
			return 1 / result;
		}

		double result = a;
		for (int i = 1; i <= b; i++) {
			result *= a;
		}
		return result;
	}

}
