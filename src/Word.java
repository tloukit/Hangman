
public class Word {
	
	private  char[] letters;
	private  boolean[] guessed;
	private char[] wrongGuesses;
	
	
	
	public Word(String s) {
		String word = s.toUpperCase();
		int wordLength = word.length();
		
		letters = new char[wordLength];
		guessed = new boolean[wordLength];
		
		for(int i = 0; i < wordLength; i++) {
			letters[i] = word.charAt(i);
		}
		
		wrongGuesses = new char[Noose.NB_STAGES];
	}
	
	/*
	 * cette méthode va indexer les booleens à la valeur "true" du tableau guessed sur les indexes du tableau letters
	 * résultat : les indexes à "true" de guessed correspondent bien aux indexes des lettres devinées dans letters
	 */
	public boolean guessLetter(char c) {
		char letter = Character.toUpperCase(c);
		
		boolean correct = false;
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] == letter) {
				correct = true;
				guessed[i] = true;
			}
		}
		return correct;
	}

	public boolean isGuessed() {
		for(boolean element : this.guessed) {
			if(!element) {
				return false;
			}
		}
		// if we reach this stage it means all the letters of the words have been guessed
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < letters.length; i++) {
			sb.append(this.guessed[i] ? this.letters[i] : "_");
		}
		return sb.toString();
		 
	}
}
