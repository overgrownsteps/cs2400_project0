import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String words = scanner.nextLine();

        // Remove spaces and count characters
        int charCount = words.replace(" ", "").length();

        System.out.println("Total number of characters in your sentence (excluding spaces): " + charCount);
        scanner.close();
    }
}