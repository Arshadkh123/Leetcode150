class Solution {
    public boolean isPalindrome(int x) {
        int d,s=0,p;
        p=x;
        while(x>0){
            d=x%10;
            s=(s*10)+d;
            x=x/10;
        }
        if(p==s)
         return true;
         return false;
        
    }
}