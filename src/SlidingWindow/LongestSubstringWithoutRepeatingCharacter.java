package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    public int lengthOfSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                count = Math.max(count, right - left +1);
            } else {
                while(s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
        }
        return count;
    }
}
