package ws06.aufgabe4;

public class Sudoku {

	public static boolean sudoku(int[][] input) {
		boolean[] isDublicate = new boolean[9];

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				int zahl = input[i][j];
				if (isDublicate[zahl - 1]) {
					return false;
				}
				isDublicate[zahl - 1] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] s1 = { { 5, 6, 2 }, //
					{ 1, 3, 7 }, //
					{ 8, 9, 4 } };
		int[][] s2 = { { 2, 2, 2 }, //
				{ 1, 3, 7 }, //
				{ 8, 9, 4 } };
		
		System.out.println(sudoku(s1));
		System.out.println(sudoku(s2));

	}
}
