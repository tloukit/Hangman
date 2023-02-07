import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
public static void main(String[] args) throws IOException {
	
	System.out.println("Hangman game!");
	
	Noose noose = new Noose();
	
	String str = getRandomWord();
	
	Word word = new Word(str);
	
	Scanner scanner = new Scanner(System.in);
	
	while(!noose.isComplete() && !word.isGuessed()) {
		System.out.println();
		
		System.out.println(noose);
		System.out.println();
		
		System.out.println(word);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		char c = scanner.nextLine().charAt(0);
		
		if(word.guessLetter(c)) {
			System.out.println("Correct!");	
		}
		else {
			System.out.println("Incorrect!");
			noose.advance();
		}
	}
	
	System.out.println();
	System.out.println(noose);
	
	System.out.println(word);
	System.out.println();
	
	if(noose.isComplete()) {
		System.out.println("you loose! the word to guess was: " + str);
	}
	else {
		System.out.println("Congratulations! You win!");
		
	}
	
	
	
	}

 private static String getRandomWord() throws IOException {
	 List<String> lines = Files.readAllLines(FileSystems.getDefault().getPath("words.txt"));
	 return lines.get(new Random().nextInt(lines.size()));
 }
 
}
