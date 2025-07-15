package hangMan;

import java.util.Scanner;

public class Main {

	static String secretWord = "JAVA";
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO HANGMAN GAME! \nLET'S PLAY");

		int wordLength = secretWord.length();
		//int chances = 5;
		char[] guessWord = new char[wordLength];

		for(int i=0; i<wordLength; i++) {
			System.out.print("_ ");
		}

		System.out.println("\n\nGuess the Word: ");
		String letter = sc.next();

		for(int i=5; i>=1; ) {
			if(secretWord.contains(letter)) {
				for(int j=0; j<wordLength; j++) {
					System.out.print(letter.equalsIgnoreCase(secretWord) ? letter:"_ ");
				}
			} else {
				System.out.println("Wrong Guess!! \nLeft with "+(i--)+" choice");
			}
		}

	}
}
