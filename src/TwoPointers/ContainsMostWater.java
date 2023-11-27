package TwoPointers;

public class ContainsMostWater {

    public int containerWithMostWater(int[] height) {
        int left = 0;
        int right = height.length -1;
        int result = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                result = Math.max(result, height[left] * (right - left));
                left++;
            } else {
                result = Math.max(result, height[right] * (right - left));
                right--;
            }
        }
        return result;
    }
}
