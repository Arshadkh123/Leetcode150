class Solution {
    public int findTheWinner(int n, int k) {
     int ans=0,i=2;
     while(i<=n){
        ans=(ans+k)%i;
        i++;
     } 
     return (ans+1);
    }
}