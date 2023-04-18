package string;

import java.util.HashMap;
import java.util.Map;

public class StringUtility {

	// Two strings s and t are isomorphic if the characters in s can be replaced to
	// get t.
	// We can map a character only to itself or to one other character.
	// No two character should map to same character.
	// Replacing each character in string s with the character it is mapped to results in string t.
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (map.get(s.charAt(i))!= t.charAt(i)) {
					return false;
				}
			} else {
				//it does not contain the key, but it contains the value- mismatch
				if (map.containsValue(t.charAt(i))) {
					return false;
				}
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
		//This can also be done by replacing characters in one of the strings
	}

	public static String reverse(String str) {
		char[] ch = str.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		while (left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		return new String(ch);
	}
	
	//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    //A subsequence of a string is a new string that is formed from the original string by 
	//deleting some (can be none) of the characters without disturbing the relative positions 
	//of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
	public static boolean isSubsequence(String s, String t) {
		int ptr = 0;
		if (s.equals(""))
			return true;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == s.charAt(ptr)) {
				ptr++;
			}
			if (ptr == s.length()) {
				return true;
			}
		}
		return false;
	}
	
	//similar to isomorphic, except here abba should match a string with similar mapping rules
	public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length) return false;
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))) {
                
                if(!map.get(pattern.charAt(i)).equals(strArray[i])) { //!= wont work here
                    return false;
                }
            } else {
                if (map.containsValue(strArray[i])){
                    return false;
                }
                map.put(pattern.charAt(i), strArray[i]);
            }
        }
        Character.isLetterOrDigit('1');
        return true;
    }
	
	public static String originalDigits(String s) {
	    int[] count = new int[10];
	    for (int i = 0; i < s.length(); i++){
	        char c = s.charAt(i);
	        if (c == 'z') count[0]++;
	        if (c == 'o') count[1]++; //1-0-2-4
	        if (c == 'w') count[2]++;
	        if (c == 'h') count[3]++; //3-8
	        if (c == 'u') count[4]++; 
	        if (c == 'f') count[5]++; //5-4
	        if (c == 'x') count[6]++;
	        if (c == 's') count[7]++; //7-6
	        if (c == 'g') count[8]++;
	        if (c == 'i') count[9]++; //9-8-5-6
	        //zero,two,six,eight, -- one,three,four,five,seven,nine
	    }
	    count[7] -= count[6];
	    count[5] -= count[4];
	    count[3] -= count[8];
	    count[9] = count[9] - count[8] - count[5] - count[6];
	    count[1] = count[1] - count[0] - count[2] - count[4];
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i <= 9; i++){
	        for (int j = 0; j < count[i]; j++){
	            sb.append(i);
	        }
	    }
	    return sb.toString();
	}

}
