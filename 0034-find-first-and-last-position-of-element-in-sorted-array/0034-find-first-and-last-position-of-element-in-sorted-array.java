class Solution {
    int firstOccurances(int arr[],int n,int target)
    {
       int low=0;
       int high=n-1;
       int first=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target)
        {
            first=mid;
            high=mid-1;
        }
        else if(arr[mid]<target)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return first;
    }
     int lastOccurances(int arr[],int n,int target)
    {
       int low=0;
       int high=n-1;
       int last=-1;
       while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target)
        {
            last=mid;
           low =mid+1;
        }
        else if(arr[mid]<target)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
       int first=firstOccurances(nums,n,target);
        if(first==-1) return new int[] {-1,-1};
        int last=lastOccurances(nums,n,target);
        return new int[]{first,last};
       
    }
}