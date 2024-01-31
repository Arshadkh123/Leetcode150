class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(mp.containsKey(val)){
                int index=mp.get(val);
                if(index==i)continue;
                return new int[]{i, index};
            }

            mp.put(nums[i], i);//filling Hash map
        }
        return new int[]{-1,-1};
    }
}
