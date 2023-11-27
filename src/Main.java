import Arrays.ContainsDuplicate;
import Arrays.GroupAnagrams;
import Arrays.TwoSum;
import Arrays.ValidAnagram;

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
    }
}
