class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixsum[]=new int[nums.length];
        int count=0;
        prefixsum[0]=nums[0];
        for(int i=1;i<prefixsum.length;i++)
        {
            prefixsum[i]=nums[i]+prefixsum[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int sum=(i==0)? prefixsum[j]:prefixsum[j]-prefixsum[i-1];
                if(sum==k)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}