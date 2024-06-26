import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letter ");
        String columnTitle = scanner.nextLine();

        int numericValue = titleToNumber(columnTitle);
        scanner.close();
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
