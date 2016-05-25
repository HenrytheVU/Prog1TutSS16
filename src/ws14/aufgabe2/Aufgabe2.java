package ws14.aufgabe2;

public class Aufgabe2 {

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

	public static void main(String[] args) {

		int[] array = { 3, 5, 76, 453, 123, 33, 1 };

		sortiereAbsteigend(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
