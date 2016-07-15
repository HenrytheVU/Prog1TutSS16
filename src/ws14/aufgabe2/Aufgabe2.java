package ws14.aufgabe2;

public class Aufgabe2 {
	
	// L�sung mit Hilfe des BubbleSort
	public static int[] sortiereAbsteigend(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	
	// L�sung nach dem Algorithmus aus der Vorlesung
	public static int[] sortiereAbsteigend2(int[] array){
		int temp;
		int gesamtAnzahl = array.length;
		int indexHoechsterZahl;
		
		// j gibt immer die Stelle im Array an, ab der der unsortierte Teil beginnt
		for (int j = 0;j < gesamtAnzahl-1; j++ ){
			indexHoechsterZahl = j;
			
			// suche im verbleibenden Array die gr��te Zahl 
			for(int i = j+1; i< gesamtAnzahl; i++){
				if (array[i]>array[indexHoechsterZahl]){
					indexHoechsterZahl = i;
				}
			}
			
			// Die gefundene h�chste Zahl mit der Zahl ander Stelle j tauschen
			temp = array[j];
			array[j] = array[indexHoechsterZahl];
			array[indexHoechsterZahl]=temp;
		}
		return array;
	}


	public static void main(String[] args) {

		int[] array = { 3, 5, 76, 453, 123, 33, 1 };

		sortiereAbsteigend(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
