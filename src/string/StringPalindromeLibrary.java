package string;

import java.util.ArrayList;

public class StringPalindromeLibrary {

	// Manacher's Algorithm: Manacher's algorithm is an efficient algorithm for finding the longest palindromic substring in a string. It works by exploiting the symmetrical nature of palindromes to reduce the number of comparisons needed to find the longest palindromic substring.

	// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    // Given a string s, return true if it is a palindrome, or false otherwise.
	// Below method 
	// OR remember some useful methods: Character.isLetterOrDigit(c), Character.toLowerCase((char) c)
	// OR Other way--- 
	//		    convert Strign s to lowerCase with regex
    //			String tempString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    //			Reverse the tempString 
    //			String rev = new StringBuffer(tempString).reverse().toString();
    //		    check tempString to rev String 
    //          return tempString.equals(rev);
	// OR Other way---
	// see the next method
	public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        ArrayList<Character> ch = new ArrayList<>();
        ch.add(' ');
        ch.add(',');
        ch.add(':');
        ch.add('.');
        ch.add('@');
        ch.add('#');
        ch.add('_');
        ch.add('[');
        ch.add(']');
        ch.add('{');
        ch.add('}');
        ch.add('\\');
        ch.add('\'');
        ch.add('\"');
        ch.add('-');
        ch.add('?');
        ch.add(';');
        ch.add('!');
        ch.add(')');
        ch.add('(');
        ch.add('`');
        while(left < right){
            System.out.println(s.charAt(left) + " --- "+ s.charAt(right));
            if(ch.contains(s.charAt(left))) {
                left++;
            } else if(ch.contains(s.charAt(right))){
                right--;
            } else {
                if(s.charAt(left) != s.charAt(right)) {
                    return false;
                }
            left++;
            right--;
            }
        }
        return true;
    }
	
	// the first 2 for loops can also be moved to a static block
	public boolean isPalindrome1(String s) {
        char[] charMap = new char[256];
        for (int i = 0; i < 10; i++)
            charMap['0'+i] = (char) (1+i);  // numeric - don't use 0 as it's reserved for illegal chars
        for (int i = 0; i < 26; i++)
            charMap['a'+i] = charMap['A'+i] = (char) (11+i);  //alphabetic, ignore cases, continue from 11
        
        for (int start = 0, end = s.length()-1; start < end;) {
            if (charMap[s.charAt(start)] == 0)
                start++;
            else if (charMap[s.charAt(end)] == 0)
                end--;
            else if (charMap[s.charAt(start++)] != charMap[s.charAt(end--)])
                return false;
        }
        return true;
    }

	//rotate string
	// hint A+A will contain all rotations of A
	//public boolean rotatestring(String s, String goal) {
	//	return A;
	//}
	
}
