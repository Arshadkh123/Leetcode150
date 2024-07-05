class Solution {
    public boolean isPalindrome(int x) {
       int rev=0;
       int d,p=x;
       while(x>0){
        d=x%10;
        rev=(rev*10)+d;
        x/=10;
       }
       if(p==rev)
       return true;
       else
       return false;

    }
}