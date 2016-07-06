package ws06.aufgabe2;

public class MainParameter {

	public static void main(String[] args) {
		String line = "";
		for(int i = args.length - 1; i >= 0; i--) {
			String word = '\"' + args[i] + '\"';
			if(i != 0 ) {
				word += '\t';
			}
			line += word;
		}
		System.out.println(line);
	}
}
