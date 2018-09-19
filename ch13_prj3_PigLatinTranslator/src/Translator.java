
public class Translator {

	private String englishInput;
	private String[] words;
	private String pigLatinOutput;
	
	public Translator(String englishInput) {
		this.englishInput = englishInput;
		pigLatinOutput = "";
	}
	
	public String getEnglishInput() {
		return englishInput;
	}
	
	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}
	
	public String[] getWords() {
		return words;
	}
	
	public void setWords(String[] words) {
		this.words = words;
	}
	public String getPigLatinOutput() {
		return pigLatinOutput;
	}
	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}
	
	public String translate() {
		convertToLowercase();
		parseStringToArray();
		removePunctuation();
		
		//words is now 'clean' and ready for translation
		// 1) if word starts with a vowel, add 'way' to the end
		// 2) if the word starts with a consonant, move all of 
		// the consonants that appear before the first vowel 
		// to the end of the word, then add 'ay' to the end of the word
		// 3) if a word starts with the letter y, the y should be treated 
		// as a consonant. If the y appears anywhere else in the word,
		// it should be treated as a vowel.
		for (int i = 0; i< words.length; i++) {
			String s = words[i];
			if (startsWithVowel(s)) {
				s+="way";
			}
			else if (!startsWithVowel(s)) {
				int v = indexOfFirstVowel(s);
				String sub1 = s.substring(0, v);
				String sub2 = s.substring(v, s.length());
				s = sub2+sub1+"ay";
			}
			words[i] = s;
		}
		for (String s: words) {
			pigLatinOutput+=(s+ " ");
		}
		
		return pigLatinOutput;
	}
	
	private int indexOfFirstVowel(String s) {
		int i = 0;
		
		for (i=0; i< s.length(); i++) {
				char c = s.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y') {
					break;
			}
		}
		
		return i;
	}	
	private boolean startsWithVowel(String s) {
			boolean startsWithVowel = false;
			if (s.startsWith("a") || s.startsWith("e") || 
					s.startsWith("i") || s.startsWith("o") ||
					s.startsWith("u")) {
				startsWithVowel = true;
		
		}
		return startsWithVowel;
	}
	
	private void convertToLowercase() {
		englishInput = englishInput.toLowerCase();
	}
	
	private void parseStringToArray() {
		words = englishInput.split(" ");
	}
	
	private void removePunctuation() {
		for (int i = 0; i<words.length; i++) {
			// remove ',' '.' '!' and '?' from the end of each word
			String s = words[i];
			if (s.endsWith(",")||s.endsWith(".")||
					s.endsWith("!")||s.endsWith("?")) {
				int l = s.length();
				s = s.substring(0, 1-1);
				words[i] = s;
			}
		}
	}




}
