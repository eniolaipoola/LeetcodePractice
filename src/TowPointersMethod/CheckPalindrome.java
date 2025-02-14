package TowPointersMethod;

/**
 * Given a string s, return true if it is a palindrome, false otherwise.
 * A string is a palindrome if it reads the same forward as backward.
 * That means, after reversing it, it is still the same string.
 * For example: "abcdcba", or "racecar"
 */
public class CheckPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("temple"));
    }

    public static boolean isPalindrome(String word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

