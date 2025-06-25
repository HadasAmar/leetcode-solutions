class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int i;
        for(i=0; i<nums.length&& nums[i]<=min2; i++){
            if(nums[i]<=min1){
                min1=nums[i];
            }
            else if(nums[i]<min2)
                min2=nums[i];
        }
        return i!=nums.length;
    }
} 