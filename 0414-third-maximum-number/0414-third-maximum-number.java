class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int distinct=1;
        int last=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]!=last)
            {
                distinct++;
                last=nums[i];
            }
            if(distinct==3)
            {
                return nums[i];
            }
        }
       
        return nums[n-1];
    }
}