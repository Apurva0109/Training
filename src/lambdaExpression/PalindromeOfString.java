//1. Check if a given string is a palindrome
package lambdaExpression;

import java.util.function.Predicate;

public class PalindromeOfString {
    public static void main(String[] args){
        //Without using lambda Expression
        System.out.println("Is string ababa is palindrome: "+checkPalindrome("ababa"));
        System.out.println("Is string abdc is palindrome: "+checkPalindrome("abcd"));

        //Using lambdaExpression
        Predicate<String> isPalindrome = str -> {
            for(int index=0;index<str.length()/2;index++){
                if(str.charAt(index)!=str.charAt(str.length()-index-1))
                    return false;
            }
            return true;
        };
        System.out.println("Is string abcdcba is palindrome: "+isPalindrome.test("abcdcba"));
        System.out.println("Is string apurva is palindrome: "+isPalindrome.test("apurva"));
    }
    public static boolean checkPalindrome(String str){
        for(int index=0;index<str.length()/2;index++){
            if(str.charAt(index)!=str.charAt(str.length()-index-1))
                return false;
        }
        return true;
    }

}
