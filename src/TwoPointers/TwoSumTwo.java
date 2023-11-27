package TwoPointers;

public class TwoSumTwo {

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left < right) {
            int total = nums[left] + nums[right];
            if(total < target) left++;
            else if(total > target) right--;
            else return new int[] {left +1, right +1};
        }
        return new int[] {left +1, right +1};
    }
}
