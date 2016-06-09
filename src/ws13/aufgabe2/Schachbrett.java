package ws13.aufgabe2;

public class Schachbrett {
	
	boolean[][] brett = new boolean[8][8];
	
	Schachbrett(){
		
	}
	
	// a)
	void setzeTurm(int x, int y){
		for (int i = 0; i < brett.length; i++){
			brett[x][i] = true;
		}
		
		for (int j = 0 ; j <= 7; j++){
			brett[j][y] = true;
		}
	}
	
	
	void setzeTurm2(int x, int y){
		for (int i = 0; i <= 7; i++){
			for (int j = 0; j <= 7; j++){
				if (i == x || j == y){
					brett[i][j] = true;
				} else {
					brett[i][j] = false;
				}
			}
		}
	}
	
	// b)
	void gibtBedrohteFelderAus(){
		for (int x = 0; x <= 7; x++){
			for (int y = 0 ; y <= 7 ; y++){
				if (brett[x][y]){
					System.out.print("x\t");
				} else {
					System.out.print("o\t");
				}
			}
			System.out.println();
		}
	}

}
