class Solution {
    public int removeElement(int[] nums, int val) {
        //边界处理
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for(int fast = 0;fast < nums.length;fast++) {
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}