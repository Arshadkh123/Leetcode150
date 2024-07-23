class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> freq= new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Integer num[] =new Integer[n];
        for(int i=0;i<n;i++){
            num[i]=nums[i];
        }

        Arrays.sort(num, (a,b)->{
            if(freq.get(a).equals(freq.get(b))){
                return Integer.compare(b, a);
            }
            return Integer.compare(freq.get(a), freq.get(b));
        });

        for(int i=0;i<n;i++){
            nums[i]=num[i];
        }

        return nums;
    }
}