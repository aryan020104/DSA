package roadmap.Array;

public class palindromeCheck {
    public static void main(String[] args) {
        String str = "hello";

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                isPalindrome = false;
            break;

        }
        left++;
        right--;
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
