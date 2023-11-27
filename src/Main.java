import Arrays.ContainsDuplicate;
import Arrays.GroupAnagrams;
import Arrays.TwoSum;
import Arrays.ValidAnagram;
import TwoPointers.TwoSumTwo;
import TwoPointers.ValidPalindrome;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] dupes = {2, 3, 5, 2, 1};
        System.out.println(duplicate.duplicates(dupes));

        ValidAnagram anagram = new ValidAnagram();
        System.out.println(anagram.anagram("race", "acres"));

        TwoSum twoSum = new TwoSum();
        int[] sums = {2, 7, 11, 15};
        System.out.println(twoSum.twoSum(sums, 9));

        GroupAnagrams anagrams = new GroupAnagrams();
        String[] strings = {"eat", "tea", "ate", "nat", "bat"};
        System.out.println(anagrams.groupAnagrams(strings));

        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.palindrome("A man, a Plan! A Canal: PANAMA!"));

        TwoSumTwo twoSum2 = new TwoSumTwo();
        System.out.println(twoSum2.twoSum(sums, 13));
    }
}
