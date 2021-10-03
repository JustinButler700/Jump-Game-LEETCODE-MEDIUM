// Justin Butler 10/3/2021
class Solution {
    public boolean canJump(int[] nums) 
    {
        int validIndex = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--) //traverse backwards, to see if we can reach the start
        {
            if(nums[i]+i >= validIndex)
            {
                validIndex = i;
            }
        }
        return validIndex ==0;
    }
}
