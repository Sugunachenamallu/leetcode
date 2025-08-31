class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int l=0,h=nums1.length;
        while(l<=h){
            int m1= (l+h)/2;
            int m2=(((nums1.length)+(nums2.length)+1)/2)-m1;
            int l1=(m1==0) ? Integer.MIN_VALUE : nums1[m1-1];
            int r1=(m1==nums1.length) ? Integer.MAX_VALUE:nums1[m1];
            int l2=(m2==0) ? Integer.MIN_VALUE:nums2[m2-1];
            int r2=(m2==nums2.length) ? Integer.MAX_VALUE:nums2[m2];
            if(l1<=r2 && l2<=r1)
            {
                if((nums1.length+nums2.length)%2==0)
                {
                    return (double)(Integer.max(l1,l2)+Integer.min(r1,r2))/2.0;
                }
                else{
                    return (double) Integer.max(l1,l2);
                }
            }
            else if(l2>r1)
            {
                l=m1+1;
            }
            else{
                h=m1-1;
            }
        }
        return 0;
    }
}