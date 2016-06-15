package string;

public class StringTest {

	public static void main(String[] args) {
		
		 char[] charArray = "Hallo Welt, wie geht's".toCharArray();
		 
		 String line = "";
		 for(int i = 0; i < charArray.length; i++) {
			 if(charArray[i] != ' ' ) {
				 line += charArray[i];
			 }
		 }
		 
		 String a = new String("blah");
		 String b = new String("blah");
		 
		 int i1 = 3;
		 int i2 = 3;
		 
		 System.out.println(a == b);
		 System.out.println(!a.equals(b));
	}
}
