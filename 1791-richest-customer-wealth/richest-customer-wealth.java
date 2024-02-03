class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealthsofar=0;
        for(int []customer:accounts){
            int currentcustomerwealth=0;
            for(int bank:customer){
                currentcustomerwealth += bank;
            }
            maxwealthsofar=Math.max(maxwealthsofar,currentcustomerwealth);
        }
        return maxwealthsofar;
        
    }
}