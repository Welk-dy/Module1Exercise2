public class palindromeChecker {
    public static boolean isPalindrome(String inputString) {
        // Convert the string to lowercase to ensure the check is case-insensitive
        inputString = inputString.toLowerCase();

        // Initialize start and end pointers
        int start = 0;
        int end = inputString.length() - 1;

        // Compare characters from both ends moving towards the center
        while (start < end) {
            // If characters at start and end are different, it's not a palindrome
            if (inputString.charAt(start) != inputString.charAt(end)) {
                return false;
            }
            // Move towards the center
            start++;
            end--;
        }

        // If all characters matched, it is a palindrome
        return true;
    }
}