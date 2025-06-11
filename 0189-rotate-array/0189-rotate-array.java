class Solution {
     public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1 || k == 0) return;
        int[] arr = Arrays.copyOf(nums, nums.length);
        int j = nums.length - (k % nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (j >= nums.length) {
                j = 0;
            }
            nums[i] = arr[j];
            j++;
        }
    }
}