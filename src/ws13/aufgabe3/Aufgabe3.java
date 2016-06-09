package ws13.aufgabe3;

public class Aufgabe3 {
	
	int[] addiere(int[] a, int[]b){
		int[] result = new int[a.length];
		boolean uebertrag = false;
		
		for (int i = a.length -1; i >= 0; i--){
			int zwischenergebnis = a[i] +b[i];
			
			if(uebertrag){
				zwischenergebnis++;
				uebertrag = false;
			}
			
			if (zwischenergebnis > 9){
				zwischenergebnis = zwischenergebnis - 10;
				uebertrag = true;
			}
			
			result[i] = zwischenergebnis;
			
		}
		
		if (uebertrag){
			int[] result2 = new int[a.length+1];
			result2[0] = 1;
			for (int i = 1; i < result2.length; i++){
				result2[i]= result[i-1];
			}
			return result2;
		}
			
		
		return result;
	}

}
