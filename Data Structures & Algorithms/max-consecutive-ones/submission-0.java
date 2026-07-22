class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,m=0;
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]==1)
            {
                m++;
                i++;
            }
            else
            {
                m=0;
                i++;
            }
            max=Math.max(max,m);
        }
        return max;
    }
}