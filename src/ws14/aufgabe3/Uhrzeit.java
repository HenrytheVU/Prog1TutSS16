package ws14.aufgabe3;

public class Uhrzeit {
	int std;
	int min;
	int sek;

	public Uhrzeit(int std, int min, int sek) {
		this.std = std;
		this.min = min;
		this.sek = sek;
	}// endconstructor

	public int getStd() {
		return std;
	}// endmethod getStd

	public void setStd(int std) {
		this.std = std;
	}// endmethod setStd

	public int getMin() {
		return min;
	}// endmethod getMin

	public void setMin(int min) {
		this.min = min;
	}// endmethod setMin

	public int getSek() {
		return sek;
	}// endmethod getSek

	public void setSek(int sek) {
		this.sek = sek;
	}// endmethod setSek

	@Override
	public String toString() {
		return "Stunden:" + std + "\nMinuten: " + min + "\nSekunden: " + sek;
	}// endmethod toString
}// endclass Uhrzeit