package ws05.aufgabe1;

public class Aufgabe1 {

	boolean istHexZiffer(char c) {
		if (c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F') {
			return true;
		}
		return false;
	}

}
