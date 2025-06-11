class Solution {
    public boolean canJump(int[] nums) {
        // int[] arr= new int[];
        int max=1;
        for(int i=0; i<nums.length; i++){
            max--;
            if(max<0)
                return false;
            max=Math.max(max, nums[i]);
        }
        return max>=0;
    }
}