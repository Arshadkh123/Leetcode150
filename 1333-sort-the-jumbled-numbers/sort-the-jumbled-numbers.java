class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> sp =new ArrayList<int[]>();

        for(int i=0;i<nums.length; i++){
           int mapvalue= 0;
           int tem=nums[i];
           int place=1;

           if(tem==0) {
            sp.add(new int[]{mapping[0], i});
            continue;
           }

           while(tem != 0){
            mapvalue= place * mapping[tem % 10] + mapvalue;
            place=place*10;
            tem/=10;
           }
           sp.add(new int[]{ mapvalue, i});
        }
        Collections.sort(sp,(a,b)-> a[0]-b[0]);

        int ans[] =new int[nums.length];
        for(int i=0;i<sp.size();i++){
            ans[i]= nums[sp.get(i)[1]];
        }
        return ans;
    }
}