package ss13;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		int[] a = {6,9,6,4,3,1,2};
		int[] f = {6,4,3};
		System.out.println(feldEnthalten(a,f));
		
		int[] a2 = {7,9,6,1,2,4,2};
		int[] f2 = {1,2,3};
		System.out.println(feldEnthalten(a2, f2));
		
		System.out.println(feldEnthalten(a, a));
		
	}
	
	public static boolean feldEnthalten(int[] array, int[] feld){
		
		for (int i = 0; i <= (array.length - feld.length); i++){
			boolean result = true;
			
			for (int j = 0 ; j < feld.length; j++){
				if(array[i+j] != feld[j]){
					result = false;
				}	
			}
			
			if (result){
				return true;
			}
		}
			
		return false;
	}

}
