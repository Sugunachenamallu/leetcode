class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>n/3 && !res.contains(nums[i]))
            {
               res.add(nums[i]);
            }
        }
        return res;
    }
}