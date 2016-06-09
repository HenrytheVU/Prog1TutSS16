package ws13.aufgabe1;

public class Aufagbe1 {
	
	public static void main(String[] args) {
		System.out.println("23 ist zweistellig: " + istZweistellig(23));
		System.out.println("100 ist zweistellig: " + istZweistellig(100));
		System.out.println("10 ist zweistellig: " + istZweistellig(10));
		System.out.println("99 ist zweistellig: " + istZweistellig(99));
		System.out.println("9 ist zweistellig: " + istZweistellig(9));
	}
	
	public static boolean istZweistellig(int zahl){
		if (zahl < 0){
			zahl = zahl * -1;
		}
		
		if (zahl > 9 && zahl < 100){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean istZweistellig2(int zahl ){
		if ((zahl > 9 && zahl < 100) || (zahl > -100 && zahl < -9)){
			return true;
		}
		
		return false;
	}

}
