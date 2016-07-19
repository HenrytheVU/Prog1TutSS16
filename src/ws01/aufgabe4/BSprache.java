package ws01.aufgabe4;

public class BSprache {

	public static char[] uebersetzeInBSprache(char[] input) {
		int counter = input.length;
		for (int i = 0; i < input.length; i++) {
			if(isVocal(input[i])) {
				counter += 2;
			}
		}
		char[] result = new char[counter];
		int resultIndex = 0;
		for (int i = 0; i < input.length; i++) {
			if(isVocal(input[i])) {
				result[resultIndex++] = input[i];
				result[resultIndex++] = 'b';
				result[resultIndex++] = input[i];
			} else {
				result[resultIndex++] = input[i];
			}
		}
		return result;
	}
	
	static boolean isVocal(char c){
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
	public static void main(String[] args) {
		String word = new String(uebersetzeInBSprache("spiel mit mir".toCharArray()));
		System.out.println(word);
	}
}
