package ss14.aufgabe5;

public class Gebrauchtwagen {
	
	private String typ_ref;
	private int tachostand;
	private double verbrauch, einkaufspreis, verkaufspreis;
	
	public static final int KEINTACHOSTAND = -1;
	public static final double KEINVERBRAUCH = -1.0;
	
	Gebrauchtwagen(String typ_ref, int tachostand, double verbrauch, double einkaufspreis){
		
//		if (tachostand < 0 || tachostand > 200000){
//			
//		}
		if (tachostand >= 0 && tachostand <= 200000){
			this.tachostand = tachostand;
		} else {
			this.tachostand = KEINTACHOSTAND;
		}
		
		this.verbrauch = verbrauch;
		if (verbrauch < 3.0 || verbrauch > 20.0){
			this.verbrauch = KEINVERBRAUCH;
		}
		
		if (einkaufspreis < 1000.0 || einkaufspreis > 50000.0){
			this.einkaufspreis = 10000.0;
		} else {
			this.einkaufspreis = einkaufspreis;
		}
		
		this.verkaufspreis = 2 * this.einkaufspreis;
		this.typ_ref = typ_ref;
	}
	
	public int kmzumKundendienst(){
		
		// (tachostand < 0 || tachostand > 200000)
		if (this.tachostand == KEINTACHOSTAND){
			return -1;
		}
		
		int ergebnis = this.tachostand % 20000;
		return 20000 - ergebnis;
	}

}
