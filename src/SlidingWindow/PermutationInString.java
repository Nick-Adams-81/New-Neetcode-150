package SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length() || s2.length() == 0) return false;
        if(s1.length() == 0) return true;

        int s1Length = s1.length();
        int s2Length = s2.length();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < s1Length; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        for(int i = s1Length; i < s2Length; i++) {
            if(Arrays.equals(arr1, arr2)) return true;
            arr2[s2.charAt(i - s1Length) - 'a']--;
            arr2[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(arr1, arr2);
    }
}
