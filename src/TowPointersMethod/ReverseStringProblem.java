package TowPointersMethod;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringProblem {

    public static void main(String[] args) {

       char[] s = {'h','e','l','l','o'};
      // char[] input = {"h","e","l","l","o"};
       char[] d = {'H','a','n','n','a','h'};
        reverseString(s);
       // reverseString(d);

    }

    public static void reverseStringChar(char[] s) {
        List<Character> chars = new ArrayList<>();

        int j = s.length - 1;

        while(j >= 0) {
            chars.add(s[j]);
            j--;
        }

        String result =  chars.toString();
        System.out.println(result);
    }

    public static void reverseString(char[] s) {
        List<String> chars = new ArrayList<>();
        System.out.println(s.length);

        int j = s.length - 1;

        while(j >= 0) {
            chars.add(String.valueOf(s[j]));
            System.out.println(s[j]);
            j--;
        }

        String result =  chars.toString();
        System.out.println(result);
    }
}
