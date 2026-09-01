class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;//nums的末尾
        int p2 = n - 1;//nums2的末尾
        int tail = m + n - 1;//合并后数组的末尾

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] > nums2[p2]) {
                nums1[tail] = nums1[p1];
                p1--;
            }else {
                nums1[tail] = nums2[p2];
                p2--;
            }
            tail--;
        }

        while(p2 >= 0) {
            nums1[tail] = nums2[p2];
            p2--;
            tail--;
        }
    }
}