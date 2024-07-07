class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int totalbottles=numBottles;
       while(numBottles>=numExchange){
        totalbottles+=(numBottles/numExchange);
        numBottles=(numBottles/numExchange)+(numBottles%numExchange);
       } 
       return totalbottles;
    }
}