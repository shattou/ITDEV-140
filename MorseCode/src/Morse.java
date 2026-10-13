public class Morse {

 public int NUM_CHARS = 40;
 private String original;
 private String mcode = "";
 private char[] regular = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?', ' '};
 private String[] morse = {".-", "- . . .", "-.-.", "-..", ".", "..-.", "--.", ". . . .", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", ". . .", "-", "..-", ". . . -", ".--", "-..-", "-.--", "--..",
			".---", "..---", ". . . --", ". . . .-", ". . . ..", "- . . . .", "-- . . .", "---..", "----.", "-----", "--..--", ".-.-.-", "..--..", " "};

 public Morse(String m){
	 original = m;
 }

 public String toMorse(char ch) {

	int index = new String(regular).indexOf(ch);
	return morse[index];
 }

 public String getMorseCode() {

	 for(int i = 0; i < original.length(); i++) {
		 mcode  += this.toMorse(original.charAt(i));
	 }
	 return mcode;
 }

 public String getOriginal() {
	 return original;
 }

}
