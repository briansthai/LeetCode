
/*
 * Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
 * 
 * Example 1:
 * Input: s = "bcabc"
 * Output: "abc"
 * 
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of lowercase English letters.
 */ 
public class removedup {
    public static void main(String[] args)
    {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    public static String removeDuplicateLetters(String s) 
    {
        char[] alphabet = new char[26];
        String removedDups = "";
        //ASCII value of lowercase a starts at 97
        for (int i = 0; i<s.length(); i++)
        {
            int asciiVal = s.charAt(i);
            alphabet[asciiVal-97] = s.charAt(i);
        }

        for (int i = 0; i < alphabet.length; i++)
        {
            if (alphabet[i] != 0)
                removedDups = removedDups.concat(Character.toString(alphabet[i]));
        }
        return removedDups;
    }
}

