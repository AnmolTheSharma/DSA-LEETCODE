class Solution {
    public int maxSubArray(int[] nums) {
        int minvalue=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(minvalue<0){
                minvalue=nums[i];
            }
            else{
                minvalue+=nums[i];
            }
            ans=Math.max(minvalue,ans);
        }
        return ans;
    }
}