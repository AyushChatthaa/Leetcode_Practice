class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0],count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
            ans=Math.max(ans,count);
            if(count<0)
            count=0;
        }
        return ans;
    }
}