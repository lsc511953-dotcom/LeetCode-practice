import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        //多数元素是指超过一半的元素
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}