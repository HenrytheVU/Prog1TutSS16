package ss14.aufgabe2;

public class Liste {

	private Knoten start;

	public Liste() {

	}

	public Knoten getStart() {
		return start;
	}

	public void setStart(Knoten start) {
		this.start = start;
	}

	// Aufgabe a)
	public void delete(int position) {

		if (position == 1) {
			start = start.getNext();
		
		} else {

			Knoten knotenVordemZuLoeschenden = start;
			Knoten zuloeschenderKnoten = start.getNext();

			for (int i = 2; i < position; i++) {
				knotenVordemZuLoeschenden = knotenVordemZuLoeschenden.getNext();
				zuloeschenderKnoten = knotenVordemZuLoeschenden.getNext();
			}

			knotenVordemZuLoeschenden.setNext(zuloeschenderKnoten.getNext());
		}
	}
	
	// alternative L�sung
	public void delete2(int position){
		
		// Sonderfall muss extra abgegfangen werden
		if (position == 1){
			start = start.getNext();
			return;
		}
		
		Knoten temp = start;
		
		for (int i = 1; i < position; i++){
			temp = temp.getNext();
		}
		
		// jetzt ist der Knoten temp == dem Vorg�nger des zu l�schenden Knoten;
		temp.setNext(temp.getNext().getNext());
		
	}
	
	public void add(int position, Knoten k){
		if (position == 1){
			k.setNext(start);
			start = k;
			return;
		} 
		
		Knoten vorderPosition = start;
		Knoten gesuchtePosition = start.getNext();
		int i = 2;
		while(i < position){
			vorderPosition = vorderPosition.getNext();
			gesuchtePosition = gesuchtePosition.getNext();
			i++;
		}
		
		vorderPosition.setNext(k);
		k.setNext(gesuchtePosition);
		
		
	}
	
	public int getNumberofElements(){
		return 0;
	}
	
	public Knoten getKnotenByName(String name){
		return null;
	}

}
