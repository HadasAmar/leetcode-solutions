class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, max=0;
        while(left!=right){
            if((right-left)*Math.min(height[left],height[right])>max)
                max=(right-left)*Math.min(height[left],height[right]);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}