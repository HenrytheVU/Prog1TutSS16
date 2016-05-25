package ws14.aufgabe3;

public class ReiseTest {

	public static void main(String[] args) {
		Reise[] nixwieweg = new Reise[80];

		TagesReise tagesReise1 = new TagesReise("Barcelona", 1000, new Uhrzeit(10, 20, 30), new Uhrzeit(8, 2, 12));
		TagesReise tagesReise2 = new TagesReise("Rom", 700, new Uhrzeit(0, 1, 2), new Uhrzeit(3, 2, 1));

		UrlaubsReise urlaubsReise1 = new UrlaubsReise("Hawaii", 2000, 14, "Hüte", TransportMittel.FLUGZEUG,
				Verpflegung.ALLINKLUSIVE);
		UrlaubsReise urlaubsReise2 = new UrlaubsReise("Prag", 5000, 14, "Freudenhaus", TransportMittel.PKW,
				Verpflegung.VOLLPENSION);

		nixwieweg[0] = tagesReise1;
		nixwieweg[1] = tagesReise2;
		nixwieweg[2] = urlaubsReise1;
		nixwieweg[3] = urlaubsReise2;

		sucheZiele(nixwieweg);

	}

	public static void sucheZiele(Reise[] reisen) {
		for (int i = 0; i < reisen.length; i++) {
			if (reisen[i] == null) {
				System.out.println("Feldkomponente mit Index: " + i + " ist nicht belegt!");
			} else if ("Barcelona".equals(reisen[i].getReiseziel())) {
				System.out.println(reisen[i]);
			}
		}
	}

}
