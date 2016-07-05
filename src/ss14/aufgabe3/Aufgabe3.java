package ss14.aufgabe3;

public class Aufgabe3 {
	
	
	public int[] bytesUmrechnen(int gesamt){
		int[] ergebnis = new int[4];
		
		int gb = 1024*1024*1024;
		int mb = 1024*1024;
		int kb = 1024;
		
		ergebnis[0] = gesamt / gb;
		gesamt = gesamt % gb;
		
		ergebnis[1] = gesamt / mb;
		gesamt = gesamt % mb;
		
		ergebnis[2] = gesamt / kb;
		gesamt = gesamt % kb;
		
		ergebnis[3] = gesamt;
		
		return ergebnis;
	}

}
