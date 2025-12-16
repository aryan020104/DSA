package recursion2;

import java.util.Scanner;

public class palindrome {
    boolean namespace(int i, String word) {
        if (i >= word.length() / 2) {
            return true;
        }
        if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
            return false;
        }
        return namespace(i + 1, word);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();

        System.out.println(word);
        System.out.println(new palindrome().namespace(0, word));
    }

}
