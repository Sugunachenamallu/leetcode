/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       return sortedArray(nums, 0, nums.length - 1);
    }
    public TreeNode sortedArray(int nums[],int left,int right)
    {
    
        int mid=(left+right)/2;
        if(left>right) return null;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedArray(nums,left,mid-1);
        root.right=sortedArray(nums,mid+1,right);
        return root;
    }
}