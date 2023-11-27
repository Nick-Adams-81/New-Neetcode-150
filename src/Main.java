import Arrays.ContainsDuplicate;
import Arrays.ValidAnagram;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] dupes = {2, 3, 5, 2, 1};
        System.out.println(duplicate.duplicates(dupes));

        ValidAnagram anagram = new ValidAnagram();
        System.out.println(anagram.anagram("race", "acres"));
    }
}
