class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=nums.length){
        //         return nums.length;
        //     }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
            // else if(nums[i]!=nums.length){
            //     return nums.length;
            // }
        }

        return nums.length;
    }
    }
    