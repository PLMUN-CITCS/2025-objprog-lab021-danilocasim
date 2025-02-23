import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        String inputtedSentence = getSentenceInput();
        System.out.printf("The sentence has %d words.\n", countWords(inputtedSentence));
        
    }

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
    }

    public static int countWords (String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
}