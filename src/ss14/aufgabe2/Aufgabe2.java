package ss14.aufgabe2;

public class Aufgabe2 {

	public static boolean gueltigeMatrikelNr(int zahl) {
		if((zahl >= 5000000 && zahl <= 5199999) || (zahl >= 6100000 && zahl <= 6199999)) {
			return true;
		}
		return false;
	}
	
	public static boolean gueltigeMatrikelNr1(int zahl) {
		zahl = zahl/100000;
		if(zahl == 50 || zahl == 51 || zahl == 61) {
			return true;
		}
		return false;
	}
}
