package Arrays;

public class ValidAnagram {

    public boolean anagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] chars = new int[26];
        for(int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for(int num : chars) {
            if(num != 0) return false;
        }
        return true;
    }
}
