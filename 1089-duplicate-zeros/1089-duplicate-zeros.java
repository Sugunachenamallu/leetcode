class Solution {
    public void duplicateZeros(int[] arr) {
     
        int n=arr.length;
        int res[]=new int[n];
        int index=0;
        for(int i=0; i<n && index<n;i++)
        {
            if(arr[i]==0)
            {
                index+=2;
            }
            else{
                res[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<res.length;i++)
        {
           arr[i]=res[i];
        }
    }
}