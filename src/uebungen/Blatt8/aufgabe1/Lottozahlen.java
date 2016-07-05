package uebungen.Blatt8.aufgabe1;

import java.util.concurrent.ThreadLocalRandom;

public class Lottozahlen {

	public static void main(String[] args) {

		int[] lottozahlen = new int[6];
		int zaehler = 0;
		
		while (zaehler <= 5) {
			int neueZahl = ThreadLocalRandom.current().nextInt(1, 50); 
			// frueher: (int) Math.random()*49;
			
			if (!istSchonVorhanden(neueZahl, lottozahlen)){
				lottozahlen[zaehler] = neueZahl;
				zaehler++;
			}	
		}
		
		for(int z : lottozahlen){
			System.out.print(z + " ");
		}
		System.out.println();
		sortiereArray(lottozahlen);
		
		for(int z : lottozahlen){
			System.out.print(z + " ");
		}
	}
	
	public static boolean istSchonVorhanden(int zahl, int[] array){
		for (int z : array){
			if (z == zahl){
				return true;
			}
		}
		return false;
	}
	
	
	public static void sortiereArray(int[] array){
		
		for (int i = 0; i < array.length ; i++){
			int minPosition = i;
			
			for (int j = i+1; j < array.length; j++){
				if(array[j]< array[minPosition]){
					minPosition = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[minPosition];
			array[minPosition] = temp;
		}
	}

}
