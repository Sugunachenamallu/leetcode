class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=nums[0];
        int cur_max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur_max=Math.max(nums[i],nums[i]+cur_max);
            max_so_far=Math.max(cur_max,max_so_far);

        }
        return max_so_far;
    }
}