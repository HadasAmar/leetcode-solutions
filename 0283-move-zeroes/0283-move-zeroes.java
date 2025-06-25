class Solution {
    public void moveZeroes(int[] nums) {

        int right=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0&&right<i){
                nums[right++]=nums[i];
                nums[i]=0;
            }
            else if (nums[i] != 0) {
    right++;
}
        }
        
    }
}