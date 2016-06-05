package ws14.aufgabe5;

// a)
public class Bruch {
	
	int zaehler;
	int nenner;
	
	// nicht gefordert, aber sehr sinnvoll
	Bruch(int z, int n){
		zaehler = z;
		nenner = n;
	}
	
	// b)
	public static Bruch multipliziereBrueche(Bruch a, Bruch b){
		int neuerZaehler = a.zaehler*b.zaehler;
		int neuerNenner = a.nenner*b.nenner;
		Bruch neuerBruch = new Bruch(neuerZaehler,neuerNenner);
		return neuerBruch;
		// return new Bruch(a.zaehler*b.zaehler, a.nenner*b.nenner);
	}
	
	// c)
	public static Bruch addiereBrueche(Bruch eins, Bruch zwei){
		int neuerNenner = eins.nenner * zwei.nenner;
		int neuerZaehlerEins = eins.zaehler * zwei.nenner;
		int neuerZaehlerZwei = zwei.zaehler * eins.nenner;
		int neuerZaehler = neuerZaehlerEins + neuerZaehlerZwei;
		Bruch neuerBruch = new Bruch(neuerZaehler, neuerNenner);
		return neuerBruch;
		// return new Bruch(eins.zaehler*zwei.nenner + zwei.zaehler*eins.nenner, eins.nenner*zwei.nenner);
	}
	
	// d)
	public void multipliziereMitBruch(Bruch b){
		zaehler = zaehler * b.zaehler;
		nenner = nenner*b.nenner;
		
		// Bruch neuerBruch = multipliziereBrueche(b, this);
		// this.nenner = neuerBruch.nenner;
		// zaehler = neuerBruch.zaehler;
		
	}
	
	public String toString(){
		return zaehler + "/" + nenner;
	}

}
