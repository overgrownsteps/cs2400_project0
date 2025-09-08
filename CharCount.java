import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter words in your sentence: ");
        String words = scanner.nextLine();

        // Remove spaces and count characters
        int charCount = words.replace(" ", "").length();

        System.out.println("Total number of characters (excluding spaces): " + charCount);
        scanner.close();
    }
}