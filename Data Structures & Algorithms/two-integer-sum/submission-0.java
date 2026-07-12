class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int con=target-nums[i];
            if(hm.containsKey(con))
            {
                return new int[]{hm.get(con),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
