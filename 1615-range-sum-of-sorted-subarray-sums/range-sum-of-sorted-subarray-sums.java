class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
     int s;
     ArrayList<Integer> storeSubarray= new ArrayList<>();
     for(int i=0;i<n;i++){
        s=0;
        for(int j=i;j<n;j++){
          s=s+nums[j];
          storeSubarray.add(s);
        }
     }

     Collections.sort(storeSubarray);

     int rangeSum=0, mod=(int)1e9 + 7;
       for (int i = left - 1; i <= right - 1; i++) {
            rangeSum = (rangeSum + storeSubarray.get(i)) % mod;
        }
        return rangeSum;
 

    }
}